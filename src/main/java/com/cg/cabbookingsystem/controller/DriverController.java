package com.cg.cabbookingsystem.controller;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cabbookingsystem.dto.Booking;
import com.cg.cabbookingsystem.dto.Driver;
import com.cg.cabbookingsystem.dto.Report;
import com.cg.cabbookingsystem.exception.DriverNotFoundException;
import com.cg.cabbookingsystem.service.DriverService;

@Transactional
@RestController
@RequestMapping("/driver")
@CrossOrigin(origins = "http://localhost:4200")
//http://localhost:8180/driver
public class DriverController {
	@Autowired
	private DriverService driverService;

	
	public DriverController(DriverService driverService) {
		super();
		this.driverService = driverService;
	}

	
	@GetMapping(value = "get/{email}/{password}", produces = "application/json")
	public Driver  fetchDriver(@PathVariable String email, @PathVariable String password) throws DriverNotFoundException {
		return driverService.findDriver(email, password);
	}

	@PostMapping(value = "/saveDriver", consumes = "application/json")
	public Driver saveDriver(@RequestBody Driver driver) {
		return driverService.saveDriver(driver);
	}
//	@GetMapping(value = "/id/{id}",produces = "application/json")
//	public Driver fetchById(@PathVariable int id) {
//		return driverService.fetchById(id);
//	}
	@GetMapping(value = "get/{email}", produces = "application/json")
	public Driver fetchDriver(@PathVariable String email) {
		return driverService.findDriver(email);
	}
	
	
	@GetMapping(value = "/getAllDrivers", produces = "application/json")
	public List<Driver> getAllDriver(){
		return driverService.getAllDriver();
	}
	
	
	
	
	@PostMapping(value = "/updateDriver", consumes = "application/json", 
			produces = "application/json")
	public Driver updateDriver(@RequestBody Driver driver ) {
	
		return driverService.updateDriver(driver);
	}
	
	@GetMapping( value = "/report", produces = "application/json")
	public List<Report> getAllReport(){
		return driverService.getAllReport();
	}
	@PostMapping(value = "/saveReport", consumes = "application/json")
	public Report saveReport(@RequestBody Report report) {
		return driverService.saveReport(report);
	}
	
	@PostMapping(value = "/saveBooking", consumes = "application/json")
	public Booking saveBooking(@RequestBody Booking booking) {
		return driverService.saveBooking(booking);
	}
	
	@GetMapping( value = "/getAllBooking", produces = "application/json")
	public List<Booking> getAllBooking(){
		return driverService.getBookingDetails();
	}

}
