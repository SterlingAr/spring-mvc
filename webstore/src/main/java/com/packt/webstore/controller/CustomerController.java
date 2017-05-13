package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public String listCustomers(Model model){
		
		model.addAttribute("customers", customerService.getAllCustomers());
		
		return "customers";
		
	}
	
	@RequestMapping(value = "/customers/add", method = RequestMethod.GET)
	public String addNewCustomer(Model model){
		
		Customer cus = new Customer();
		model.addAttribute("newCustomer", cus);
		return "addCustomer";
		
	}
	
	
	
	@RequestMapping(value = "/customers/add", method = RequestMethod.POST)
	public String processNewCustomer(@ModelAttribute("newCustomer") Customer cus){
		
		customerService.addCustomer(cus);
		return "redirect:/customers";
		
	}

}
