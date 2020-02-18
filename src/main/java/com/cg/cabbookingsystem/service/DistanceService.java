package com.cg.cabbookingsystem.service;

import com.cg.cabbookingsystem.dto.Locations;

public interface DistanceService {
	double priceEstimation(Locations source, Locations destination);

}
