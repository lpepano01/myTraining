package com.bpi.myTraining.M2_Activity5;

public class MSWord extends Program {
	
	public MSWord(String name) {
		super(name); 
	}
	
	@Override
	public void run() {
		System.out.println("Opening MS Word...");
		setIsRunning(true);
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping MS Word...");
		setIsRunning(false);
	}
}
