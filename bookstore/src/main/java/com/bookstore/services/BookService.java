package com.bookstore.services;

import java.util.List;

import com.bookstore.domain.repository.Book;

public interface BookService {
	
	List<Book> getAllBooks();
	Book getBookByID(String bookId);

}
