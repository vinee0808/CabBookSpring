package com.cg.cabbookingsystem.dao;

import com.cg.cabbookingsystem.dto.Locations;

public interface DistanceDao {
	double priceEstimation(Locations source, Locations destination);

}
