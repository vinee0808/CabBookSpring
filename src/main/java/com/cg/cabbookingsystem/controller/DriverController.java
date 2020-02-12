package com.cg.cabbookingsystem.controller;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cabbookingsystem.dto.Driver;
import com.cg.cabbookingsystem.service.DriverService;

@Transactional
@RestController
@RequestMapping("/driver")
@CrossOrigin(origins = "http://localhost:4200")
//http://localhost:8180/driver
public class DriverController {

	private DriverService driverService;

	@Autowired
	public DriverController(DriverService driverService) {
		super();
		this.driverService = driverService;
	}

	@GetMapping(value = "get/{email}/{password}", produces = "application/json")
	public Driver  fetchDriver(@PathVariable String email, @PathVariable String password) {
		return driverService.findDriver(email, password);
	}

	@PostMapping(value = "/saveDriver", consumes = "application/json")
	public Driver saveDriver(@RequestBody Driver driver) {
		return driverService.saveDriver(driver);
	}
	@GetMapping(value = "/id/{id}",produces = "application/json")
	public Driver fetchById(@PathVariable int id) {
		return driverService.fetchById(id);
	}
	@GetMapping(value = "get/{email}", produces = "application/json")
	public Driver fetchDriver(@PathVariable String email) {
		return driverService.findDriver(email);
	}

}
