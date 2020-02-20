package com.cg.cabbookingsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cabbookingsystem.dao.ContactUsDao;
import com.cg.cabbookingsystem.dao.CustomerDao;
import com.cg.cabbookingsystem.dao.DriverDao;
import com.cg.cabbookingsystem.dto.ContactUs;
import com.cg.cabbookingsystem.dto.Customer;
import com.cg.cabbookingsystem.dto.Driver;
import com.cg.cabbookingsystem.exception.CustomerNotFoundException;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private ContactUsDao contactDao;

	@Override
	public Customer findCustomer(String email, String password) throws CustomerNotFoundException {
		Customer customer;
			 customer= customerDao.getCustomer(email, password);
			if(customer==null) {
				throw new CustomerNotFoundException("Customer not found");
			}
			return customer;
		}
		

	@Override
	public Customer saveCustomer(Customer customer) {

		return customerDao.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.findAll();
	}

	@Override
	public ContactUs saveContact(ContactUs contact) {
		return contactDao.save(contact);
	}

}
