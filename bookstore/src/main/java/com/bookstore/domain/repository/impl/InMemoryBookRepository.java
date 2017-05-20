package com.bookstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.domain.repository.Book;
import com.bookstore.domain.repository.BookRepository;
import com.bookstore.exceptions.BookNotFoundException;

@Repository
public class InMemoryBookRepository implements BookRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Book> getAllBooks() {
		String queryBooks = "SELECT * FROM BOOKS";
		Map<String, Object> params = new HashMap<String, Object>();

		List<Book> books = jdbcTemplate.query(queryBooks, params, new BookMapper());
		return books;

	}

	private static final class BookMapper implements RowMapper<Book> {

		@Override
		public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
			Book book = new Book();
			book.setBookId(UUID.fromString(rs.getString("book_id")));
			book.setIsbn(rs.getString("isbn"));
			book.setAuthor(rs.getString("author"));
			book.setTitle(rs.getString("title"));
			book.setCategory("category");
			book.setLength(rs.getInt("book_length"));
			book.setDescription(rs.getString("description"));

			return book;
		}

	}

	@Override
	public List<Book> getBooksByCategory(String category) {

		return null;
	}

	@Override
	public List<Book> getBooksByTitle(String title) {

		return null;
	}

	@Override
	public List<Book> getBooksByAuthor(String title) {

		return null;
	}

	@Override
	public Book getBookByID(String id) {
		String queryBook = "SELECT * FROM BOOKS WHERE book_id = :id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);

		try {
			return jdbcTemplate.queryForObject(queryBook, params, new BookMapper());
		} catch (DataAccessException e) {
			throw new BookNotFoundException(id);
		}

	}

	@Override
	public void addBook(Book book) {

	}

	@Override
	public void removeBook(Book book) {

	}

	@Override
	public void modifyBook(Book book) {

	}

}
