package com.bookstore.domain.repository.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.domain.repository.Book;
import com.bookstore.domain.repository.BookList;
import com.bookstore.domain.repository.BookListRepository;
import com.bookstore.dto.BookItemDto;
import com.bookstore.dto.BookListDto;
import com.bookstore.services.BookService;

@Repository
public class InMemoryBookListRepository implements BookListRepository {

	@Autowired
	private BookService bookService;

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public void create(BookListDto bookListDto) {

		String INSERT_BOOKLIST_SQL = "INSERT INTO BOOK_LIST (id) VALUES (:id)";

		Map<String, Object> bookListParams = new HashMap<String, Object>();

		bookListParams.put("id", bookListDto.getBookListId());

		jdbcTemplate.update(INSERT_BOOKLIST_SQL, bookListParams);

		bookListDto.getBookItems().stream().forEach(bookItemDto -> {

			Book book = bookService.getBookByID(bookItemDto.getBookId().toString());

			String INSERT_BOOKITEM_SQL = "INSERT INTO BOOK_ITEM (id,book_id,book_list_id) VALUES (:id,:bookId,:bookListId)";

			Map<String, Object> bookItemParams = new HashMap<String, Object>();
			bookItemParams.put("id", bookItemDto.getId());
			bookItemParams.put("bookId", book.getBookId());
			bookItemParams.put("bookListId", bookListDto.getBookListId());

			jdbcTemplate.update(INSERT_BOOKITEM_SQL, bookItemParams);

		});

	}

	@Override
	public BookList read(String bookListId) {

		String selectBookList = "SELECT * FROM BOOK_LIST WHERE ID = :id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", bookListId);

		BookListMapper bookListMapper = new BookListMapper(jdbcTemplate, bookService);

		try {
			return jdbcTemplate.queryForObject(selectBookList, params, bookListMapper);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}

	}

	@Override
	public void update(String bookListId, BookListDto bookListDto) {

	}

	@Override
	public void delete(String bookListId) {

		String DELETE_BOOK_ITEMS = "DELETE FROM book_item WHERE book_list_id = :bookListId";
		String DELETE_BOOK_LIST = "DELETE FROM book_list WHERE id = :bookListId";
		Map<String, Object> params = new HashMap<String, Object>();

		jdbcTemplate.update(DELETE_BOOK_ITEMS, params);
		jdbcTemplate.update(DELETE_BOOK_LIST, params);
	}

	@Override
	public void addBookItem(String bookListId, String bookId) {

		String SQL = null;
		BookList bookList = null;

		bookList = read(bookId);

		if (bookList == null) {

			BookItemDto newBookItem = new BookItemDto();
			newBookItem.setId(bookListId + bookId);
			newBookItem.setBookId(UUID.fromString(bookId));

			BookListDto newBookList = new BookListDto(bookListId);
			newBookList.addBookItem(newBookItem);
			create(newBookList);
			return;

		}

		Map<String, Object> bookItemParams = new HashMap<String, Object>();

		if (bookList.getBookItemByID(bookId) == null) {

			SQL = "INSERT INTO BOOK_ITEM (id, book_id, book_list_id) VALUES (:id,:bookId,:bookListId)";

			bookItemParams.put("id", bookListId + bookId);

		}

		bookItemParams.put("bookId", bookId);
		bookItemParams.put("bookListId", bookListId);
		jdbcTemplate.update(SQL, bookItemParams);

	}

	@Override
	public void removeBookItem(String bookListId, String bookId) {
		
		String SQL_DELETE_BOOK_ITEM = "DELETE FROM book_item WHERE book_id = :bookId AND book_list_id = :bookListId";
		Map<String,Object> deleteBookItemParams = new HashMap<String,Object>();
		deleteBookItemParams.put("bookId", bookId);
		deleteBookItemParams.put("book_list_id", bookListId);
		
		jdbcTemplate.update(SQL_DELETE_BOOK_ITEM, deleteBookItemParams);

	}

	@Override
	public void cleanBookList(String bookListId) {
		
		String SQL_CLEAN_BOOKLIST = "DELETE FROM book_item WHERE book_list_id = :bookListId";
		Map<String,Object> cleanBookList = new HashMap<String, Object>();
		
		cleanBookList.put("bookListId", bookListId);
		
		jdbcTemplate.update(SQL_CLEAN_BOOKLIST, cleanBookList);

	}

}
