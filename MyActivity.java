package com.bpi.myTraining.M2_Activity6;

public class MyActivity {

	public static void main(String[] args) {

		Car car1 = new Car("Toyota", 4); // argument constructor
		doDescribVehicle(car1);
		car1.refuel();
		car1.startEngine(); 
		destroyVehicle(car1);
		
		System.out.println("");
		Truck truck1 = new Truck(); //no-argument constructor
		truck1.setBrand("Volvo");
		truck1.setNumberOfWheels(6);
		
		
		doDescribVehicle(truck1);
		truck1.refuel();		
		truck1.startEngine();
		destroyVehicle(truck1);

	}

	public static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();
	}

	public static void doDescribVehicle(Vehicle vehicle) {
		vehicle.describeVehicle();
	}
}
