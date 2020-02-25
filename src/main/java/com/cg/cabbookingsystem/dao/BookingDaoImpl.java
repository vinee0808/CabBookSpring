package com.cg.cabbookingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.cabbookingsystem.dto.Booking;
import com.cg.cabbookingsystem.dto.CustomerRequest;

@Repository
public class BookingDaoImpl implements BookingDao {

	@Autowired
	EntityManager mgr;

	@Override
	public Booking save(Booking request) {
		mgr.persist(request);
		return request;
	}

	@Override
	public List<Booking> findAllBooking() {
		// TODO Auto-generated method stub
		return null;
	}

}
