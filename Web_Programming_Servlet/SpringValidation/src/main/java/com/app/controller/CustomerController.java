package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.entity.Customer;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

//	@GetMapping("/showForm")
	@RequestMapping("/showForm")
	public String customerForm(Model theModel) {
		Customer cust = new Customer();
		theModel.addAttribute("theCustomer", cust);
		return "customer-form";
	}

	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("theCustomer") Customer customer, BindingResult theBindingRes) {
		System.out.println(customer);
		if (theBindingRes.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}

}
