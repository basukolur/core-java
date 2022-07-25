package com.xworkz.airport.dto;

import lombok.Data;

@Data
public class AirportDTO {
	private String name;
	private String type;
	private String location;
	private int openedIn;
	
/*	public AirportDTO() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getOpenedIn() {
		return openedIn;
	}

	public void setOpenedIn(int openedIn) {
		this.openedIn = openedIn;
	}  */
}
