package com.cg.cabbookingsystem.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cabbookingsystem.dao.PriceDao;
import com.cg.cabbookingsystem.dto.Price;

@Service
@Transactional
public class PriceServiceImpl implements PriceService {
	@Autowired
	private PriceDao priceDao;

	@Override
	public Price setPrice(Price price) {
		
		return priceDao.save(price);
	}

}
