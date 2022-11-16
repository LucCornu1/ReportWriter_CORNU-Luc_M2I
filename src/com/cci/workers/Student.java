package com.cci.workers;

public class Student extends Worker {
	// Constructor
	public Student(String firstName, String lastName, String schoolName)
	{
		super(firstName, lastName);
		this.schoolName = schoolName;
	}
	
	
	// Variables
	public String schoolName;
	
	
	// Methods
	public void printWorker()
	{
		super.printWorker();
		System.out.println(schoolName);
	}
}
