package com.cg.cabbookingsystem.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cabbookingsystem.dao.DriverDao;
import com.cg.cabbookingsystem.dto.Driver;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {
	@Autowired
	private DriverDao driverDao;

	@Override
	public Driver findDriver(String email, String password) {

		return driverDao.getDriver(email, password);
	}

	@Override
	public Driver saveDriver(Driver driver) {
		return driverDao.save(driver);
	}

	@Override
	public Driver fetchById(int id) {
		return driverDao.findById(id).get();
	}

	@Override
	public Driver findDriver(String email) {
		return driverDao.getDriver(email);
	}

}
