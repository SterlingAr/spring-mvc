package com.bookstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.services.BookService;

@Controller

public class HomeController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/index")
	public String listBooks(Model model){
		
		model.addAttribute("books", bookService.getAllBooks());
		
		return "index";
		
	}
	
	

}
