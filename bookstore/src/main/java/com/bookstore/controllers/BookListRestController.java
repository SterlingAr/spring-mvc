package com.bookstore.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.domain.repository.BookList;
import com.bookstore.dto.BookListDto;
import com.bookstore.services.BookListService;

@RestController
@RequestMapping(value = "rest/booklist")
public class BookListRestController {

	@Autowired
	private BookListService bookListService;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void create(@RequestBody BookListDto bookListDto) {
		bookListService.create(bookListDto);
	}

	@RequestMapping(value = "/{bookListId}", method = RequestMethod.GET)
	public BookList read(@PathVariable(value = "bookListId") String bookListId) {
		return bookListService.read(bookListId);
	}

	@RequestMapping(value = "/{bookListId}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable(value = "bookListId") String bookListId) {
		bookListService.delete(bookListId);
	}
	
	@RequestMapping(value ="/add/{bookId}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public void addBookItem(@PathVariable(value = "bookId") String bookId, HttpSession session) {
		
		bookListService.addBookItem(session.getId(), bookId);

	}
	
	@RequestMapping(value ="/remove/{bookId}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public void removeBookItem(@PathVariable(value = "bookId") String bookId, HttpSession session){
		
		bookListService.removeBookItem(session.getId(), bookId);
	}

}
