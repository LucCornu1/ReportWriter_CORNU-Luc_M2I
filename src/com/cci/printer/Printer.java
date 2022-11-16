package com.cci.printer;

import com.cci.workers.*;
import com.cci.company.Enterprise;

public class Printer {
	// Main class
	public static void main(String[] args)
	{
		Enterprise companyA = new Enterprise("Siemens");
		companyA.addWorker(new Employee("Luc", "CORNU", 1000.f, 0.f));
		companyA.addWorker(new Employee("Luc", "CORNU", 1500.f, 12.1f));
		companyA.addWorker(new Employee("Musa", "BALLAY", 5000.f, -10.f));
		companyA.removeWorkerByID(0);
		companyA.addWorker(new Subcontractor("Chloé", "KIEGER", 100.f));
		companyA.addWorker(new Student("Jean", "DUJARDIN", "CCI Campus"));
		companyA.removeWorkerByID(4);
		companyA.addWorker(new Student("Jean", "PASDUJARDIN", "CCI Campus"));
		companyA.addWorker(new Volunteer("Alexa", "Delamarche"));
		companyA.addWorker(new Student("Kevin", "HELLSCREAM", "CCI Campus"));
		companyA.addWorker(new Volunteer("Louis", "NUSS"));
		
		companyA.printSelf();
	}
}
