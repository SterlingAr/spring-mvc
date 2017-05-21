package com.bookstore.dto;

import java.io.Serializable;
import java.util.UUID;

public class BookItemDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6495625700123124786L;
	private String id;
	private UUID bookId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UUID getBookId() {
		return bookId;
	}

	public void setBookId(UUID bookId) {
		this.bookId = bookId;
	}

}
