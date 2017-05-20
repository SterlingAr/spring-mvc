package com.bookstore.domain.repository;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8686552676003257791L;
	private UUID bookId;
	private String isbn;
	private String author;
	private String title;
	private String category;
	private int length;
	private String description;
	
	private MultipartFile image;

	public Book() {
		
	}

	public Book(String isbn, String author, String title, String category, int length, String description) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.category = category;
		this.length = length;
		this.description = description;
		bookId=UUID.randomUUID();
	}

	public Book(UUID bookId, String isbn, String author, String title, String category, int length,
			String description) {
		super();
		this.bookId = bookId;
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.category = category;
		this.length = length;
		this.description = description;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public UUID getBookId() {
		return bookId;
	}

	public void setBookId(UUID bookId) {
		this.bookId = bookId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		return true;
	}
	
	
	
	


}
