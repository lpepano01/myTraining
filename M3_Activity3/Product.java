package com.bpi.myTraining.M3_Activity3;

public class Product implements Comparable<Product>{
	String productName; 
	double productPrice;
	
	public Product(String productName, double productPrice) {
		this.productName = productName; 
		this.productPrice = productPrice;
	}
	
	public String getName() {
		return this.productName;
	}
	
	public double getPrice() {
		return this.productPrice;
	}

	@Override
	public int compareTo(Product otherProduct) {
		// Sort by price
		//return this.productPrice - otherProduct.productPrice;
		return Double.compare(this.productPrice, otherProduct.productPrice);
		
	}
	
	
}
