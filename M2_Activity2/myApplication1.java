
package com.bpi.myTraining.main;

public class myApplication1 {

	public static void main(String[] args) {
		descBook bookObject = new descBook();
		bookObject.name = "Jungle Book";
		bookObject.color = "grey";
		bookObject.size = "large";
		bookObject.id = "S1-1928450-2025";
		bookObject.pages = 100;
		bookObject.shortDesc = ": A boy named Mowgli, raised by wolves in the jungle, learns survival, friendship, and identity among wild animals.";
		
		
		descHouse houseObject = new descHouse();
		houseObject.houseNo = "07-13";
		houseObject.street = "Maharlika Street";
		houseObject.subdivision = "Bridgetown Village";
		houseObject.barangay = "San Labrador";
		houseObject.city = "Bulacan";
		houseObject.province = "Metro Manila";
		houseObject.country = "PH";
		houseObject.owner = "Xavier Family";
		houseObject.houseID = "B01-508-20221901-G0986X";
		houseObject.houseHoldCount = 5;
		houseObject.remarks = "Grey Gate near Aling Sora's Sari-Sari Store";
				
		descTree treeObject = new descTree();
		treeObject.climate = "Warm";
		treeObject.scientificName = "Mangifera indica"; 
		treeObject.commonName = "Mango Tree";
		treeObject.fruitBearing = "Yes";
		treeObject.leafDesc = "Glossy, dark green, and lance-shaped";
		treeObject.height = "30-40 meters tall";
		
		bookObject.book();
		System.out.println(""); 
		System.out.println(""); 
		houseObject.house();
		System.out.println(""); 
		System.out.println(""); 
		treeObject.tree();	
	}
}
