package com.bpi.myTraining.M2_Activity5;
public abstract class Program {
	
	private String name;
	private boolean isRunning = false;
	
	public Program() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Program(String name) {
		this.name = name;
	}
	
	abstract void run();
	abstract void stop();
   
	public void setIsRunning (boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	public boolean getIsRunning () {
		return isRunning;
	}	
	

}	

