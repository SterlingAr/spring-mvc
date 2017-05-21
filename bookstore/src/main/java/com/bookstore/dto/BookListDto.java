package com.bookstore.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookListDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1846525433349752514L;

	private String bookListId;

	private List<BookItemDto> bookItems;

	public BookListDto(){}

	public BookListDto(String bookListId) {
		this.bookListId = bookListId;
		bookItems = new ArrayList<>();
	}

	public List<BookItemDto> getBookItems() {
		return bookItems;
	}

	public void setBookItems(List<BookItemDto> bookItems) {
		this.bookItems = bookItems;
	}
	
	public void addBookItem(BookItemDto bookItemDto){
		this.bookItems.add(bookItemDto);
	}

	public String getBookListId() {
		return bookListId;
	}

	public void setBookListId(String bookListId) {
		this.bookListId = bookListId;
	}

}
