package com.bookstore.domain.repository;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8686552676003257791L;
	private UUID bookId;
	private List<Author> authors;
	private String isbn;
	private String title;
	private String category;
	private int length;
	private String description;

	





}
