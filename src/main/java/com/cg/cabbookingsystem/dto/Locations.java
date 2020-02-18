package com.cg.cabbookingsystem.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Locations {
	@Id
	private int locationId;
	private double xCoordinate;
	private double yCoordinate;
	private String place;

	public Locations(double xCoordinate, double yCoordinate, String place) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.place= place;
	}

	
	public int getLocationId() {
		return locationId;
	}


	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

}
