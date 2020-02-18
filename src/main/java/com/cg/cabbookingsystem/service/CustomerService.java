package com.cg.cabbookingsystem.service;

import java.util.List;

import com.cg.cabbookingsystem.dto.Customer;

public interface CustomerService {
	Customer findCustomer(String email, String password);

	Customer saveCustomer(Customer customer);
	List<Customer> getAllCustomers();
}