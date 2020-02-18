package com.cg.cabbookingsystem.dao;

import org.springframework.stereotype.Repository;

import com.cg.cabbookingsystem.dto.Locations;
@Repository
public class DistanceDaoImpl implements DistanceDao {

	@Override
	public double priceEstimation(Locations source, Locations destination) {
//		double fare = 0.0;
//		double distance = 0;
		
		double distance = Math.sqrt(Math.pow(source.getxCoordinate() - destination.getxCoordinate(), 2)
				+ Math.pow(source.getyCoordinate() - destination.getyCoordinate(), 2));
		double fare= distance*18;
		return  fare;
	}

	

}
