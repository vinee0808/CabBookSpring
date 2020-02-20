package com.cg.cabbookingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.cabbookingsystem.dto.Customer;
import com.cg.cabbookingsystem.exception.CustomerNotFoundException;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
	@Query("Select c FROM Customer c WHERE c.email=:email AND c.password=:password")
	Customer getCustomer(String email, String password) throws CustomerNotFoundException;


}
