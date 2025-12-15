package com.bpi.myTraining.M3_Activity2;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class ProductApp {

	private int optionInt = 0; 
	private Scanner input = new Scanner(System.in);
	Set<String> productsList = new HashSet<>();
	
	public static void main(String[] args) {
		ProductApp app = new ProductApp();
		app.initProducts();
		
		boolean continueLoop = true; 
		
		
		while (continueLoop == true) {
			app.displayOptions();
			app.validateInput();
			continueLoop = app.runSelectedOption();
			
			if (continueLoop == true) {
				String returnMenu = app.repeatOptions();
				
				// this checks if my input from app.repeatOptions is equal to "N"
				if ("N".equalsIgnoreCase(returnMenu)) {
					app.doExit();
					continueLoop = false; // stop looping
				}
			}
						
		}		
		
		app.input.close();
	} // end-Main
	

	public void displayOptions() {
		System.out.println("Select an option (1-4):");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and count");
		System.out.println("4. Exit");
		System.out.print("> ");
	} // end-displayOptions

	
	public void initProducts() {
		productsList.add("Laptop");
		productsList.add("Monitor");
		productsList.add("Mouse");
		productsList.add("Keyboard");
		productsList.add("Printer");
		productsList.add("Speaker");
	} // end-initProducts

	
	public void validateInput() {
		String optionStr = null;
		boolean valid = false; 
		while(valid != true) {

			optionStr = input.nextLine();
			
			if (optionStr != null) {
				if (optionStr.length()==1) {
					int checkDigit = optionStr.charAt(0);
					if(checkDigit >= '1' && checkDigit <= '4') {
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
		if (optionInt == 1) {
			doSearchProduct();
			return true; 
		} else if(optionInt == 2) {
			doAddProduct();
			return true; 
		} else if(optionInt == 3) {
			doPrintProduct();
			return true; 
		} else if(optionInt == 4) {
			doExit();
			return false;
		} 
		
		return true;
	} // end-runSelectedOption			

	
	public void doSearchProduct() {
		System.out.print("Enter product name to search: ");
		String inStr = input.nextLine();
		
		boolean productFound = false; 
		for (String product : productsList ) {
			if(product != null && product.equalsIgnoreCase(inStr.trim())) {
				productFound = true; 
			}
		} // end-for loop

		if (productFound==true) {
			System.out.println("Product found: " + inStr);
		} else {
			System.out.println("Product not found!");
		}
		
	} // end-doSearchProduct

	
	public void doAddProduct() {
		String inStr = null; 
		boolean valid = false;
		while (valid == false) {
			System.out.print("Enter product name to add: "); 
			inStr = input.nextLine();
			
			if (inStr.isBlank() || inStr.isEmpty()) {
				System.out.print("Invalid input..."); 
			} else { valid = true; }			
		}

		productsList.add(inStr);
		System.out.println("Product added: " + inStr);
	} // end-doAddProduct

	
	public void doPrintProduct() {
		System.out.println("");
		System.out.println("All products: ");
		for (String product : productsList) {
			System.out.println("   " + product);
		}
		
		System.out.println("Total unique products: " + productsList.size());
	} // end-doAddProduct

	
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
