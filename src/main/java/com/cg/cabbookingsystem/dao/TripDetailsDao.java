package com.cg.cabbookingsystem.dao;

import com.cg.cabbookingsystem.dto.CustomerRequest;

/**
 * Dao Interface containing abstract method for saving trip details
 * @author
 *
 */
public interface TripDetailsDao {
	
	CustomerRequest saveTripDetails(CustomerRequest details);


}
