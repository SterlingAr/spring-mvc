package com.bookstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.bookstore.domain.repository.BookItem;
import com.bookstore.domain.repository.BookList;
import com.bookstore.services.BookService;

public class BookListMapper implements RowMapper<BookList> {

	private BookItemMapper bookItemMapper;
	private NamedParameterJdbcTemplate jdbcTemplate;

	public BookListMapper(NamedParameterJdbcTemplate jdbcTemplate, BookService bookService) {
		super();
		this.jdbcTemplate = jdbcTemplate;

		bookItemMapper = new BookItemMapper(bookService);
	}

	@Override
	public BookList mapRow(ResultSet rs, int rowNum) throws SQLException {
		String id = rs.getString("id");

		BookList bookList = new BookList(id);

		// I select all the book items belonging to the book list
		String queryBookItems = String.format("SELECT * FROM book_item WHERE book_list_id = '%s'", id);
		List<BookItem> bookItems = jdbcTemplate.query(queryBookItems, bookItemMapper);
		
		bookList.setBookItems(bookItems);

		return bookList;
	}

}
