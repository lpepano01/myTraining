package com.bpi.myTraining.M3_Activity1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class M3A1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		List<String> products = new LinkedList<>();
		int count = 0; 
		String itemNo; 
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");

		System.out.println("All products: ");

		for(String product : products) {
			count += 1; 
			itemNo = Integer.toString(count);
			System.out.println(itemNo + ". " + product);
		}			
		System.out.println("");
		
		products.add("Webcam");
		products.remove(1);
		
		System.out.println("After adding and removing products: "+ products);
		for(String product : products) {
			count += 1; 
			itemNo = Integer.toString(count);
			System.out.println(itemNo + ". " + product);
			
		}	
		
		System.out.println("");
		
		System.out.print("Enter a product: ");
		String inpStr = input.nextLine();
		
		boolean productFound = false; 
		for(String product : products) {
			//System.out.println(product);
			if (inpStr == product) {
				productFound = true; 
			}
		}	
		
		if (productFound) {
			System.out.println("Product found: " + inpStr);
		} else {
			System.out.println("Product not found: " + inpStr);
		}	
		
		input.close();
	}
	
}
