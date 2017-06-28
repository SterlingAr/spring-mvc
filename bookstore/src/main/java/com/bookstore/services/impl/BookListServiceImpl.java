package com.bookstore.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.repository.BookList;
import com.bookstore.domain.repository.BookListRepository;
import com.bookstore.dto.BookListDto;
import com.bookstore.services.BookListService;

@Service
public class BookListServiceImpl implements BookListService {
	
	@Autowired
	private BookListRepository bookListRepository;

	@Override
	public void create(BookListDto bookListDto) {
		
		bookListRepository.create(bookListDto);
		
	}

	@Override
	public BookList read(String bookListId) {
		
		return bookListRepository.read(bookListId);
	}

	@Override
	public void update(String bookListId, BookListDto bookListDto) {
		
		bookListRepository.update(bookListId, bookListDto);
		
	}

	@Override
	public void delete(String bookListId) {
		
		bookListRepository.delete(bookListId);
		
	}

	@Override
	public void addBookItem(String bookListId, String bookId) {
		
		bookListRepository.addBookItem(bookListId, bookId);
		
	}

	@Override
	public void removeBookItem(String bookListId, String bookId) {
		
		bookListRepository.removeBookItem(bookListId, bookId);
		
	}

	@Override
	public void cleanBookList(String bookListId) {
		
		bookListRepository.cleanBookList(bookListId);
		
	}

}
