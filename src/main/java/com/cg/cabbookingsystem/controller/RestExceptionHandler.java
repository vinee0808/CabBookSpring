package com.cg.cabbookingsystem.controller;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.cabbookingsystem.exception.CustomerNotFoundException;
import com.cg.cabbookingsystem.exception.DriverNotFoundException;




@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
@RestController
public class RestExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler({CustomerNotFoundException.class, DriverNotFoundException.class})
	@ResponseBody
	public ResponseEntity<Object> handleInvalidLogin(Exception User) {

		System.out.println("Exception: " + User.getMessage());

		return new ResponseEntity<>(User.getMessage(), HttpStatus.NOT_FOUND);

	}

}
