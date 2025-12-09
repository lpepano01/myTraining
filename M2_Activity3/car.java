package com.bpi.myTraining.M2_Activity3;

public class car {
	// Adding attributes
	private String make; 
	private String model; 
	private String year; 
	private String color; 
	
	// Parameterized constructor
	public car(String make, String model, String year, String color) {
		this.make = make; 
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	// no-args contsructor
	public car() {
		
	}	

	public void setMake(String make) {
		this.make = make;
	}
	
	String getMake() {
		return make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	String getModel() {
		return model;
	}
		
	public void setYear(String year) {
		this.year = year;
	}
	
	String getYear() {
		return year;
	}
		
	public void setColor(String color) {
		this.color = color;
	}
	
	String getColor() {
		return color;
	}
		
	void showCarInfo () {
		System.out.println("Simple Car Catalogue");
		System.out.println("Car make: " + this.make + "; Car model: " + this.model + "; Car year: " + this.year + "; Car color: " + this.color + ".");
	}
}
