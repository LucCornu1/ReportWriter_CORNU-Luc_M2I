package com.cci.printer;

import java.security.KeyStore.Entry;
import java.util.SortedMap;
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
		print(companyA);
	}
	
	public static void print(Enterprise business)
	{
		System.out.println("Great Report");
		System.out.println("------------");
		System.out.println("");
		
		SortedMap<Integer, Worker> workerList = business.getListWorkers();
		
		Integer index = 0;
		
		for(var entry : workerList.entrySet())
		{
			Integer ID = entry.getKey();
			Worker somebody = entry.getValue();
			
			System.out.println("Worker n°:" + ID);
			somebody.printWorker();
			System.out.println();
			
			if ((++index % 3) == 0 || workerList.size() == index)
			{
				System.out.println("Page " + (int) Math.ceil(index/3.f));
				System.out.println("");
			}
		}
	}
}