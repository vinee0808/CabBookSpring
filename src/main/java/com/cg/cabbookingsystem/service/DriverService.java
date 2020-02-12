package com.cg.cabbookingsystem.service;

import com.cg.cabbookingsystem.dto.Driver;

public interface DriverService {
	Driver findDriver(String email, String password);

	Driver findDriver(String email);

	Driver saveDriver(Driver driver);

	Driver fetchById(int id);

}
