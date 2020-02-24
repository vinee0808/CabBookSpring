package com.cg.cabbookingsystem.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cabbookingsystem.dto.ContactUs;
import com.cg.cabbookingsystem.dto.Customer;
import com.cg.cabbookingsystem.dto.CustomerRequest;
import com.cg.cabbookingsystem.exception.CustomerNotFoundException;
import com.cg.cabbookingsystem.service.CustomerService;

@Transactional
@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:4200")
//http://localhost:8180/customer
class CustomerController {
	@Autowired
	private CustomerService customerService;


	@GetMapping(value = "/get/{email}/{password}", produces = "application/json")
	public Customer fetchCustomer(@PathVariable String email, @PathVariable String password) throws CustomerNotFoundException {
		return customerService.findCustomer(email, password);
	}

	// http://localhost:8180/customer/saveCustomer
	@PostMapping(value = "/saveCustomer", consumes = "application/json")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}


	@GetMapping(value = "/getAllCustomers")
	public List<Customer> getAll() {
		return customerService.getAllCustomers();
	}

	@PostMapping(value = "/contact", consumes = "application/json")
	public ContactUs saveContact(@RequestBody ContactUs contact) {
		return customerService.saveContact(contact);
	}

}
