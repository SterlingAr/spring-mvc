package com.bookstore.domain.repository;

import com.bookstore.dto.BookListDto;

public interface BookListRepository {

	void create(BookListDto bookListDto);

	BookList read(String bookListId);

	void update(String bookListId, BookListDto bookListDto);

	void delete(String bookListId);

	void addBookItem(String bookListId, String bookId);

	void removeBookItem(String bookListId, String bookId);

	void cleanBookList(String bookListId);

}
