package com.cg.cabbookingsystem.service;

import java.util.List;

import com.cg.cabbookingsystem.dto.Booking;
import com.cg.cabbookingsystem.dto.Driver;
import com.cg.cabbookingsystem.dto.Report;

public interface DriverService {
	Driver findDriver(String email, String password);

	Driver findDriver(String email);

	Driver saveDriver(Driver driver);

	Driver updateDriver(Driver driver);

	List<Report> getAllReport();

	List<Driver> getAllDriver();

	Report saveReport(Report report);

	List<Booking> getBookingDetails();

	Booking saveBooking(Booking booking);

}
