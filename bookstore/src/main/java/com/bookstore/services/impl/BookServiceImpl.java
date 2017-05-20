package com.bookstore.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.repository.Book;
import com.bookstore.domain.repository.BookRepository;
import com.bookstore.services.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.getAllBooks();
	}

	@Override
	public Book getBookByID(String bookId) {
	
		return bookRepository.getBookByID(bookId);
	}

}
