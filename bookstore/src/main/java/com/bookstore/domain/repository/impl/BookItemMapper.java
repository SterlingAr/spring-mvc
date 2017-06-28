package com.bookstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bookstore.domain.repository.BookItem;
import com.bookstore.services.BookService;

public class BookItemMapper implements RowMapper<BookItem> {

	private BookService bookService;

	public BookItemMapper(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@Override
	public BookItem mapRow(ResultSet rs, int rowNum) throws SQLException {

		BookItem bookItem = new BookItem(rs.getString("id"));

		bookItem.setBook(bookService.getBookByID(rs.getString("book_id")));

		return bookItem;
	}

}
