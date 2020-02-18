package com.cg.cabbookingsystem.service;

import java.util.List;

import com.cg.cabbookingsystem.dto.CustomerRequest;

public interface CustomerRequestService {
	CustomerRequest saveRequest(CustomerRequest cRequest);
	List<CustomerRequest> getAllRequests();

}
