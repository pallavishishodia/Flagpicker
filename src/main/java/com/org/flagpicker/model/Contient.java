package com.org.flagpicker.model;

import java.util.List;

public class Contient {

	private int contientId;
	private String contient;
	private List<Country> country;

	public Contient() {
	}

	public Contient(int contientId, String contient, List<Country> country) {
		super();
		this.contientId = contientId;
		this.contient = contient;
		this.country = country;
	}

	public int getContientId() {
		return contientId;
	}

	public void setContientId(int contientId) {
		this.contientId = contientId;
	}

	public String getContient() {
		return contient;
	}

	public void setContient(String contient) {
		this.contient = contient;
	}

	public List<Country> getCountry() {
		return country;
	}

	public void setCountry(List<Country> country) {
		this.country = country;
	}
}