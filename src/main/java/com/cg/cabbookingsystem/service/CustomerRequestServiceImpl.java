package com.cg.cabbookingsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cabbookingsystem.dao.CustomerRequestDao;
import com.cg.cabbookingsystem.dto.CustomerRequest;

@Service
@Transactional
public class CustomerRequestServiceImpl implements CustomerRequestService {
	@Autowired
	private CustomerRequestDao cRequestDao;

	@Override
	public CustomerRequest saveRequest(CustomerRequest cRequest) {

		return cRequestDao.save(cRequest);
	}

	@Override
	public List<CustomerRequest> getAllRequests() {
		return cRequestDao.findAll();
	}

}
