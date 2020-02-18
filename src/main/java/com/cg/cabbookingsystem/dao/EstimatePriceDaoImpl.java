package com.cg.cabbookingsystem.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.cabbookingsystem.dto.CustomerRequest;
import com.cg.cabbookingsystem.dto.Pricing;

/**
 * Dao class for fetching pricing details from the Pricing Entity.
 * @author 
 *
 */
@Repository
public class EstimatePriceDaoImpl implements EstimatePriceDao{
	
			
	@Autowired
	EntityManager mgr;
	
	@Override
	public Pricing estimatePrice(CustomerRequest details) {
		Pricing pricing = mgr.createNamedQuery("getPrice", Pricing.class).setParameter("model", details.getModel()).getSingleResult();
		return pricing;
	}
	
	
}
