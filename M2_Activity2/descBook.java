package com.bpi.myTraining.main;

public class descBook {

	String name; 
	String id;
	String color;
	String size; 
	int pages;
	String shortDesc;

	void book() {
		System.out.println("Book Title: " + this.name);
		System.out.println("ID #: " + this.id);		
		System.out.println("Color: " + this.color);
		System.out.println("Size: " + this.size);
		System.out.println("Total of Pages: " + this.pages);
		System.out.println("Short Description: " + this.shortDesc);
	}
	
	void bookName () {
		System.out.println("The name of the book is: " + this.name);
	}

	void bookColor() {
		System.out.println("The color of the book is: " + this.color);		
	}
	
	void bookSize() {
		System.out.println("The size of the book is: " + this.size);		
	}
	
	void bookPages() {
		System.out.println("The page of the book is: " + this.pages);		
	}

	void bookShortDesc() {
		System.out.println("The short description is: " + this.shortDesc);
	}

}
