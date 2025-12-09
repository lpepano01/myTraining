package com.bpi.myTraining.M2_Activity6;

public class Car extends Vehicle implements Refuable {

	public Car(String brand, int numberOfWheels) {
		super(brand, numberOfWheels);
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
		System.out.println("Vehicle Type: Car" );
		System.out.println("Car brand: " + this.getBrand() );
		System.out.println("Number of Wheels: " + this.getNumberOfWheels() );		
	}
}
