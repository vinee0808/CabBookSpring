package com.cg.cabbookingsystem.service;

import com.cg.cabbookingsystem.dto.Driver;

public interface DriverService {
	Driver findDriver(String email, String password);

	Driver saveDriver(Driver driver);

}
