package com.bookstore.domain.repository;

import java.util.List;

public interface BookRepository {
	
	List<Book> getAllBooks();
	
	List<Book> getBooksByCategory(String category);
	
	List<Book> getBooksByTitle(String title);
	
	List<Book> getBooksByAuthor(String title);
	
	Book getBookByID(String id);
	
	void addBook(Book book);
	
	void removeBook(Book book);
	
	void modifyBook(Book book);
	
	

}
