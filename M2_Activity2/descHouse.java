package com.bpi.myTraining.main;

public class descHouse {
	String houseNo; 
	String street;
	String subdivision;
	String barangay;
	String city;
	String province;
	String country;
	String owner;
	String houseID;
	int houseHoldCount;
	String remarks;
	
	void house () {
		System.out.println("House ID Number:" + this.houseID);
		System.out.println("Address: " + this.houseNo + " " + this.street + ", " + this.subdivision + ", " + this.barangay + ", " + this.city + ", " + this.province + ", " + this.country);
		System.out.println("Owner: " + this.owner);
		System.out.println("House hold count: " + this.houseHoldCount);
		System.out.println("Remarks: " + this.remarks);


	}
	
	
}
