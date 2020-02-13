package com.cg.cabbookingsystem.dto;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "price_seq", sequenceName = "seq_price")
public class Price {
	@Id
	private int priceId;
	private String source;
	private String destination;
	private String model;
	private double estimatedPrice;

	public Price(int priceId, String source, String destination, String model, double estimatedPrice) {
		super();
		this.priceId = priceId;
		this.source = source;
		this.destination = destination;
		this.model = model;
		this.estimatedPrice = estimatedPrice;
	}

	public int getPriceId() {
		return priceId;
	}

	public void setPriceId(int priceId) {
		this.priceId = priceId;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEstimatedPrice() {
		return estimatedPrice;
	}

	public void setEstimatedPrice(double estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}

}
