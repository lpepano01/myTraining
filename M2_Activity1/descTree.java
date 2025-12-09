package com.bpi.myTraining.main;

public class descTree {
	
	String scientificName;
	String commonName;
	String height;
	String leafDesc;
	String fruitBearing;
	String climate; 
	
	void tree () {
		System.out.println("Scientific Name: " + this.scientificName);
		System.out.println("Common Name: " + this.commonName);
		System.out.println("Height: " + this.height);
		System.out.println("Leaf Description: " + this.leafDesc);
		System.out.println("Is Fruit Bearing?: " + this.fruitBearing);
		System.out.println("Thrives in Type of Climate: " + this.climate);
	}
}
