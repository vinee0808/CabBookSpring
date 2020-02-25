package com.cg.cabbookingsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cabbookingsystem.dao.BookingDao;
import com.cg.cabbookingsystem.dao.DriverDao;
import com.cg.cabbookingsystem.dao.ReportDao;
import com.cg.cabbookingsystem.dto.Booking;
import com.cg.cabbookingsystem.dto.CustomerRequest;
import com.cg.cabbookingsystem.dto.Driver;
import com.cg.cabbookingsystem.dto.Report;
import com.cg.cabbookingsystem.exception.DriverNotFoundException;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {
	@Autowired
	private DriverDao driverDao;
	@Autowired
	private BookingDao bookingDao;
	@Autowired
	private ReportDao reportDao;

	@Override
	public Driver findDriver(String email, String password) throws DriverNotFoundException {
		Driver driver;
		driver = driverDao.getDriver(email, password);
		if (driver == null) {
			throw new DriverNotFoundException("Driver not found");
		}
		return driver;

	}

	@Override
	public Driver saveDriver(Driver driver) {
		return driverDao.save(driver);
	}

	@Override
	public Driver findDriver(String email) {
		return driverDao.getDriver(email);
	}

	@Override
	public Driver updateDriver(Driver driver) {
		return driverDao.save(driver);
	}

	@Override
	public List<Report> getAllReport() {
		return reportDao.findAll();
	}

	@Override
	public List<Driver> getAllDriver() {
		return driverDao.findAll();
	}

	@Override
	public Report saveReport(Report report) {
		return reportDao.save(report);
	}

	@Override
	public List<Booking> getBookingDetails() {
		return bookingDao.findAllBooking();
	}

	@Override
	public Booking saveBooking(Booking request) {

		return bookingDao.save(request);
	}

}
