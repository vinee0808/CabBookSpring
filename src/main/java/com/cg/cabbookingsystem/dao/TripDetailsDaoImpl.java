package com.cg.cabbookingsystem.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.cabbookingsystem.dto.CustomerRequest;

/**
 * Dao class implementing methods for persisting trip details in Trip Details Entity
 * @author 
 *
 */
@Repository
public class TripDetailsDaoImpl implements TripDetailsDao{

	//logger
			
	@Autowired
	EntityManager mgr;
	
	/**
	 * Dao Implementaion for persisting CustomerRequest entity 
	 * @param CustomerRequest
	 * @return CustomerRequest
	 */
	@Override
	public CustomerRequest saveTripDetails(CustomerRequest details) {
		mgr.persist(details);
		return details;
	}

}
