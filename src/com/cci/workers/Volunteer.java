package com.cci.workers;

public class Volunteer extends Worker {
	// Constructor
	public Volunteer(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	
	// Methods
	public void printWorker()
	{
		super.printWorker();
		System.out.println("Life is beautiful");
	}

}
