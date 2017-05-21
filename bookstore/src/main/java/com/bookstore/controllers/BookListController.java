package com.bookstore.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/booklist")
public class BookListController {
	
	@RequestMapping
	public String get(HttpServletRequest request) {
		return "redirect:/booklist/" + request.getSession(true).getId();
	}
	
	
	@RequestMapping(value ="/{bookListId}", method = RequestMethod.GET)
	public String getCart(@PathVariable(value = "bookListId") String cartId, Model model) {

		model.addAttribute("bookListId", cartId);
		return "booklist";
	}

}
