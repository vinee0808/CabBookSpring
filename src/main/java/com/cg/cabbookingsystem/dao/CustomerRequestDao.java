package com.cg.cabbookingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.cabbookingsystem.dto.CustomerRequest;

public interface CustomerRequestDao extends JpaRepository<CustomerRequest, Integer> {

}
