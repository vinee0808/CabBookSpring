package com.cg.cabbookingsystem.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cabbookingsystem.dao.LocationsDao;
import com.cg.cabbookingsystem.dto.Locations;
@Service
@Transactional
public class LocationsServiceImpl implements LocationsService {
	@Autowired
	private LocationsDao locationDao;

	@Override
	public Locations setLocation(Locations locations) {
		return locationDao.save(locations);
	}

	

	
}
