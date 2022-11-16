package com.cci.workers;

// The class that will be inherited by all kinds of workers
public abstract class Worker implements Printable {
	// Contructor
	public Worker(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Worker() throws Exception
	{
		throw new Exception("Worker cannot be set without a name and a last name.");
	}
	
	
	// Instanced variables
	public String firstName;
	public String lastName;
	
	
	// Methods
	public void printSelf()
	{
		System.out.println(firstName + " " + lastName);
	}
}
