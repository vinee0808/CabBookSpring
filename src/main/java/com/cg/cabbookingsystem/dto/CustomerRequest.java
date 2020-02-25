package com.cg.cabbookingsystem.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

/**
 * DTO for holding customer trip details
 * 
 * @author
 *
 */

@Entity
@SequenceGenerator(name = "request_seq", sequenceName = "seq_request")
@NamedQuery(name = "getAllRequests", query = "from CustomerRequest")
public class CustomerRequest {

	@Id
	@GeneratedValue(generator = "request_seq")
	private int requestId;
	private int customerId;
	private String source;
	private String destination;

	private String model;
	private double price;

	public CustomerRequest(int requestId, int customerId, String source, String destination, String model,
			double price) {
		super();
		this.requestId = requestId;
		this.customerId = customerId;
		this.source = source;
		this.destination = destination;
		this.model = model;
		this.price = price;
	}

	public CustomerRequest() {
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "CustomerRequest [requestId=" + requestId + ", customerId=" + customerId + ", source=" + source
				+ ", destination=" + destination + ", model=" + model + "]";
	}

}
