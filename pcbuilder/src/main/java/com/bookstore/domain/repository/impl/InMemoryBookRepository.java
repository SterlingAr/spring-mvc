package com.bookstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.domain.repository.Author;
import com.bookstore.domain.repository.AuthorRepository;
import com.bookstore.domain.repository.Book;
import com.bookstore.domain.repository.BookRepository;

@Repository
public class InMemoryBookRepository implements BookRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	private static AuthorRepository authorRepository;

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
			book.setTitle(rs.getString("title"));
			book.setCategory("category");
			book.setLength(rs.getInt("book_length"));
			book.setDescription(rs.getString("description"));

			book.setAuthors(authorRepository.getAllAuthors());

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

		return null;
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
