package com.cci.workers;

public class Employee extends Worker {
	// Constructor
	public Employee(String firstName, String lastName, Float salary, Float vacationLeft) throws IllegalArgumentException
	{
		super(firstName, lastName);
		
		if (salary < 1000.f)
		{
			throw new IllegalArgumentException("A salary cannot be set under $1000 a month");
		}

		this.salary = salary;
		this.vacationLeft = vacationLeft;
	}
	
	
	// Variables
	private Float salary = 0.f; // In dollars per month
	private Float vacationLeft = 0.f; // In days
	
	
	// Methods
	public void printWorker()
	{
		super.printWorker();
		System.out.println("$" + salary + "/month, " + vacationLeft + " days");
	}

	
	// Getters & Setters
	public Float getSalary()
	{
		return salary;
	}
	
	public void setSalary(Float number) throws IllegalArgumentException
	{
		if (number < 1000.f)
		{
			throw new IllegalArgumentException("A salary cannot be set under $1000 a month");
		}
		salary = number;
	}
	
	public Float getVacationLeft()
	{
		return vacationLeft;
	}
	
	public void setVacationLeft(Float number)
	{
		vacationLeft = number;
	}
}
