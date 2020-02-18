package com.cg.cabbookingsystem.dao;

import java.util.List;

import com.cg.cabbookingsystem.dto.CustomerRequest;
import com.cg.cabbookingsystem.dto.Location;


/**
 * Dao Interface containing abstract methods for getting location details 
 * and list of location names.
 * @author 
 *
 */
public interface GetLocationDao {
	
	/**
	 * Method to fetch location details of source and destination
	 * of passed CustomerRequest Details 
	 * @param CustomerRequest
	 * @return
	 */
	public List<Location> getLocationDetails(CustomerRequest details);
	
	/**
	 * Method to list names of locations
	 * @return
	 */
	List<String> listOfLocations();
}
