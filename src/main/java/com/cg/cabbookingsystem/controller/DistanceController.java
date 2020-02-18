package com.cg.cabbookingsystem.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cabbookingsystem.dto.Locations;
import com.cg.cabbookingsystem.service.DistanceService;

@RestController
@Transactional
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/diatance")
public class DistanceController {
	@Autowired
	private DistanceService distanceService;
	
	@GetMapping(value = "/price/{source}/{destination}", produces = "application/json")
	public double priceCal(@PathVariable Locations source, @PathVariable Locations destination) {
		return distanceService.priceEstimation(source, destination);
	}
	

}
