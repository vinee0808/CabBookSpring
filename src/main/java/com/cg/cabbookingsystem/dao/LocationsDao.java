package com.cg.cabbookingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.cabbookingsystem.dto.Locations;

public interface LocationsDao extends JpaRepository<Locations, Integer> {
	
	

}
