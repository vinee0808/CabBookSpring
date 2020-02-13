package com.cg.cabbookingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.cabbookingsystem.dto.Price;

public interface PriceDao extends JpaRepository<Price, Integer> {

}
