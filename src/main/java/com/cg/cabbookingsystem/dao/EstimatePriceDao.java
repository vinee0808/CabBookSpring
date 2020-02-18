package com.cg.cabbookingsystem.dao;

import com.cg.cabbookingsystem.dto.CustomerRequest;
import com.cg.cabbookingsystem.dto.Pricing;

/**
 * Dao Inteface abstract methods for fetching pricing details for specified
 * Trip Details.
 * @author 
 *
 */
public interface EstimatePriceDao {
	
	public Pricing estimatePrice(CustomerRequest details);

}
