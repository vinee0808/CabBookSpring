package com.cg.cabbookingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cabbookingsystem.dto.Report;


/**
 * JPA Report Repository
 * 
 * @author Vineeta
 * @version 1.0
 */
@Repository
public interface ReportDao extends JpaRepository<Report, Integer> {

}
