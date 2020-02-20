package com.cg.cabbookingsystem.service;

import java.util.List;

import com.cg.cabbookingsystem.dto.ContactUs;
import com.cg.cabbookingsystem.dto.Customer;
import com.cg.cabbookingsystem.exception.CustomerNotFoundException;

public interface CustomerService {
	Customer findCustomer(String email, String password) throws CustomerNotFoundException;

	Customer saveCustomer(Customer customer);
	List<Customer> getAllCustomers();
	ContactUs saveContact(ContactUs contact);
}