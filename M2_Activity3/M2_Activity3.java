package com.bpi.myTraining.M2_Activity3;

import java.util.Scanner;
public class M2_Activity3 {
	public static void main (String[]args) {
		car carObjectA = new car("Mitsubishi","Outlander","2023","Pearl White"); // parameterized car definition
		car carObjectB = new car(); // no-args car definition 
		
		/* Assigning values to attributes */
		carObjectB.setMake("Toyota");		
		carObjectB.setModel("Corolla");
		carObjectB.setYear("2022");
		carObjectB.setColor("Metallic Silver");

		System.out.println(carObjectA.getMake());
		System.out.println(carObjectA.getModel());
		System.out.println(carObjectA.getYear());
		System.out.println(carObjectA.getColor());
		
		/* Calling the methods */
		System.out.println("------------");
		carObjectA.showCarInfo();
		System.out.println("------------");
		carObjectB.showCarInfo();
	}
}
