package com.cg.cabbookingsystem.dao;

import java.util.List;

import com.cg.cabbookingsystem.dto.Booking;
import com.cg.cabbookingsystem.dto.CustomerRequest;

public interface BookingDao {

	Booking save(Booking request);

	List<Booking> findAllBooking();

}
