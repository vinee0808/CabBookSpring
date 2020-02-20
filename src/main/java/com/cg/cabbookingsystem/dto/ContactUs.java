package com.cg.cabbookingsystem.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContactUs {
	@Id
	@GeneratedValue(generator = "contact_seq")
	private int contactId;
	private String name;
	private String email;
	private String number;
	private String message;

	public ContactUs() {
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ContactUs(int id, String name, String email, String number, String message) {
		super();
		this.contactId = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.message = message;
	}

}
