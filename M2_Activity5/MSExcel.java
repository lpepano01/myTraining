package com.bpi.myTraining.M2_Activity5;
public class MSExcel extends Program {
	
	public MSExcel(String name) {
		super(name); 
	}

	@Override
	public void run() {
		String message = "Opening MS Excel...";
		System.out.println(message);
		setIsRunning(true);
	}
	
	@Override
	public void stop() {
		String message = "Stopping MS Excel...";
		System.out.println(message);
		setIsRunning(false);
	}
}

