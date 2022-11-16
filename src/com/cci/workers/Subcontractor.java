package com.cci.workers;

public class Subcontractor extends Worker {
	// Constructor
	public Subcontractor(String firstName, String lastName, Float dailyRate)
	{
		super(firstName, lastName);
		this.dailyRate = dailyRate;
	}
	
	
	// Variables
	private Float dailyRate = 0.f;
	
	
	// Methods
	public void printSelf()
	{
		super.printSelf();
		System.out.println("$" + dailyRate + "/day");
	}
	
	
	// Getters & Setters
	public Float getDailyRate()
	{
		return dailyRate;
	}
	
	public void setDailyRate(Float number)
	{
		dailyRate = number;
	}
}
