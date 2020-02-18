package com.cg.cabbookingsystem.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cabbookingsystem.dao.DistanceDao;
import com.cg.cabbookingsystem.dto.Locations;
@Service
@Transactional
public class DistanceServiceImpl implements DistanceService {
	@Autowired
	private DistanceDao distanceDao;

	@Override
	public double priceEstimation(Locations source, Locations destination) {
		return distanceDao.priceEstimation(source, destination) ;
	}

}
