package com.bpi.myTraining.M3_Activity3;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class ProductApp {

	private int optionInt = 0; 
	private Scanner input = new Scanner(System.in);
	Map<String, Double> productsMap = new TreeMap<>();
	
	public static void main(String[] args) {
		ProductApp app = new ProductApp();
		app.initProducts();

		boolean continueLoop = true; 
		while (continueLoop == true) {
			app.displayOptions();
			app.validateInput();
			continueLoop = app.runSelectedOption();
			System.out.println(" ");
			System.out.println(" ");
			
			if (continueLoop != true) {
					continueLoop = false;
			}
		}		
		
		app.input.close();
	} // end-Main
	

	public void displayOptions() {

		System.out.println("Select an option (1-5):");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and prices");
		System.out.println("4. Find the cheapest product");
		System.out.println("5. Exit");
		System.out.print("> ");
	} // end-displayOptions

	
	public void initProducts() {
		productsMap.put("Laptop", 65000.00);
		productsMap.put("Monitor", 9000.00);
		productsMap.put("Keyboard", 2500.50);
		productsMap.put("Printer", 12999.99);
		productsMap.put("Speaker", 2349.29);
	} // end-initProducts

	
	public void validateInput() {
		String optionStr = null;
		boolean valid = false; 
		while(valid != true) {

			optionStr = input.nextLine();
			
			if (optionStr != null) {
				if (optionStr.length()==1) {
					int checkDigit = optionStr.charAt(0);
					if(checkDigit >= '1' && checkDigit <= '5') {
						optionInt = Integer.parseInt(optionStr);
						valid = true; 
					}
				}			
			}

			if (valid == false) {
				System.out.println("Invalid option...");
				System.out.println("");
				displayOptions();
			}
			
		} // end-while
	} // end-validateInput

	
	public boolean runSelectedOption() {
		
		// Try lang natin ang CASE instead of IF-ELSE
		switch(optionInt) {
		case 1: 
			doSearchProduct();
			return true; 
		case 2: 
			doAddProduct();
			return true; 
		case 3: 
			doPrintProduct();
			return true; 		
		case 4: 
			doFindCheapProduct();
			return true; 			
		case 5: 
			doExit();
			return false;			
		}

		return true;
	} // end-runSelectedOption			
	
	public void doSearchProduct() {
		System.out.print("Enter product name to search: ");
		String inStr = input.nextLine();

		//Search or a specific word
		if (productsMap.containsKey(inStr)) {
			System.out.println("Product found! Price: " + productsMap.get(inStr));
		} else {
			System.out.println("Product not found!");
		}

	} // end-doSearchProduct

	
	public void doAddProduct() {
		String inStrProduct = null; 
		String inStrPrice = null; 
		double inIntPrice = 0.00;
		boolean valid = false;
		while (valid == false) {
			System.out.print("Enter product name to add: "); 
			inStrProduct = input.nextLine();
			
			System.out.print("Enter price: ");
			inStrPrice = input.nextLine();
			
			//inIntPrice = Integer.parseInt(inStrPrice);
			inIntPrice = Double.parseDouble(inStrPrice);
			
			if (inStrProduct.isBlank() || inStrProduct.isEmpty()) {
				System.out.print("Invalid input..."); 
			} else { valid = true; }			
		}

		productsMap.put(inStrProduct, inIntPrice);
		System.out.println("Product added: " + inStrProduct);
	} // end-doAddProduct

	
	public void doPrintProduct() {
		System.out.println("");
		System.out.println("All products: ");
		
		for (Map.Entry<String, Double> entry : productsMap.entrySet()){
			System.out.println(" " + entry.getKey() + " - " + entry.getValue());
		}
		
		System.out.println("Total unique products: " + productsMap.size());
	} // end-doAddProduct

	
	public void doFindCheapProduct() {
		double productPrice = 999999999.99;
		String productName = null; 

		for(Map.Entry<String, Double> entry : productsMap.entrySet()) {
			if (entry.getValue() < productPrice) {
				productPrice = entry.getValue();
				productName = entry.getKey();
			}
		}
		
		System.out.println("Cheapest product - " + productName + " - " + productPrice);
		
	} //doFindCheapProduct
	
	
	public void doExit() {
		System.out.println("Exiting...");
	}

	
	public String repeatOptions() {
		boolean valid = false; 
		String outStr = null;
		while(valid == false) {
			System.out.println("");
			System.out.print("Return to Main menu (Y/N)? ");
			String inStr = input.nextLine();
			outStr = inStr.trim().toUpperCase(); 
			

			if (outStr.equals("Y") || outStr.equals("N")) {
				valid = true; 
			} else {
				System.out.println("Invalid input. Input Y or N only...");
			}
		}
		System.out.println("");
		System.out.println("");
		return outStr; 
	} // repeatOptions

	
} // end-M3A2
