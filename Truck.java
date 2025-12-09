package com.bpi.myTraining.M2_Activity6;

public class Truck extends Vehicle implements Refuable{
		
	public Truck(String brand, int numberOfWheels) {
		super(brand, numberOfWheels);
	}
	
	public Truck() {
		super();
	}
	
	@Override
	public void startEngine() {
		System.out.println("   " + this.getBrand() + " engine started... ");
	}
	
	@Override
	public void refuel() {
		System.out.println("   " + this.getBrand() + " is being refueled... ");
	}

	@Override
	public void destroy() {
		System.out.println("   " + this.getBrand() + " vehicle destroyed!");
	}	
	
	@Override
	public void describeVehicle() {
		System.out.println("Vehicle Type: Truck" );
		System.out.println("Car brand: " + this.getBrand() );
		System.out.println("Number of Wheels: " + this.getNumberOfWheels() );		
	}
	
}
