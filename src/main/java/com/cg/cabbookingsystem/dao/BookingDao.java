package com.cg.cabbookingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.cabbookingsystem.dto.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer> {

}
