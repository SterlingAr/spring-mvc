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

	public Book() {
	}

	public Book(List<Author> authors, String isbn, String title, String category, int length, String description) {
		super();
		this.authors = authors;
		this.isbn = isbn;
		this.title = title;
		this.category = category;
		this.length = length;
		this.description = description;
		bookId = UUID.randomUUID();
	}

	public Book(UUID bookId, List<Author> authors, String isbn, String title, String category, int length,
			String description) {
		super();
		this.bookId = bookId;
		this.authors = authors;
		this.isbn = isbn;
		this.title = title;
		this.category = category;
		this.length = length;
		this.description = description;
	}

	public UUID getBookId() {
		return bookId;
	}

	public void setBookId(UUID bookId) {
		this.bookId = bookId;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", authors=" + authors + ", isbn=" + isbn + ", title=" + title + ", category="
				+ category + ", length=" + length + ", description=" + description + "]";
	}

}
