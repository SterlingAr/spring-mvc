package com.bookstore.domain.repository;

import java.io.Serializable;
import java.util.UUID;

public class BookItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8549028687736106494L;

	private String id;

	private Book book;

	public BookItem(String id) {
		super();
		this.id = id;
	}

	public  String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		BookItem other = (BookItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookItem [id=" + id + ", book=" + book + "]";
	}

}
