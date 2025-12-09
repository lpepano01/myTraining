package com.bpi.myTraining.M2_Activity6;

public abstract class Vehicle {
	private String brand;
	private int numberOfWheels;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String brand, int numberOfWheels) {
		this.brand = brand;
		this.numberOfWheels = numberOfWheels;
	}
	
	// Setters and Getters: brand, and number of wheels
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}	
	
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}	
		
	//abstract method (idea)
	public abstract void startEngine();
	
	//concrete method
	public void destroy() {
		System.out.println("Vehicle is destroyed!");
	}
	
	public void describeVehicle() {
		System.out.println("Type of vehicle not stated");
		System.out.println("Vehicle not stated");
		System.out.println("Number of wheels not stated");	
	}
	
}
