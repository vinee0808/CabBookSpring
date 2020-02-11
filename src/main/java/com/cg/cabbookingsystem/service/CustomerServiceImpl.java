package com.cg.cabbookingsystem.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cabbookingsystem.dao.CustomerDao;
import com.cg.cabbookingsystem.dao.DriverDao;
import com.cg.cabbookingsystem.dto.Customer;
import com.cg.cabbookingsystem.dto.Driver;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer findCustomer(String email, String password) {
		return customerDao.getCustomer(email, password);
	}

	@Override
	public Customer saveCustomer(Customer customer) {

		return customerDao.save(customer);
	}

}
