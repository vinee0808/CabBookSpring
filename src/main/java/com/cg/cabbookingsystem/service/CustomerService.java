package com.cg.cabbookingsystem.service;

import com.cg.cabbookingsystem.dto.Customer;

public interface CustomerService {
	Customer findCustomer(String email, String password);

	Customer saveCustomer(Customer customer);
}