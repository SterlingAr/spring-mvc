package com.bookstore.exceptions;

public class BookNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4087712756756978274L;

	private String bookId;

	public BookNotFoundException(String bookId) {
		this.setBookId(bookId);
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

}
