package com.cg.cabbookingsystem.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cabbookingsystem.dto.Customer;
import com.cg.cabbookingsystem.service.CustomerService;

@Transactional
@RestController
@RequestMapping("/customer")
//http://localhost:8180/customer
class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping(value = "/get/{email}/{password}", produces = "application/json")
	public Customer fetchCustomer(@PathVariable String email, String password) {
		return customerService.findCustomer(email, password);
	}

	@PostMapping(value = "/saveCustomer", consumes = "application/json")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

}
