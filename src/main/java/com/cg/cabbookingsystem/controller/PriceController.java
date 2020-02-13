package com.cg.cabbookingsystem.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cabbookingsystem.dto.Driver;
import com.cg.cabbookingsystem.dto.Price;
import com.cg.cabbookingsystem.service.PriceService;

@Transactional
@RestController
@RequestMapping("/price")
@CrossOrigin(origins = "http://localhost:4200")
public class PriceController {
	
	@Autowired
	private PriceService priceService;
	
	@PostMapping(value = "/savePrice", consumes = "application/json")
	public Price savePrice(@RequestBody Price price) {
		return priceService.setPrice(price);
	}

}
