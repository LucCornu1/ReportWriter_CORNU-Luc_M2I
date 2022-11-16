package com.cci.company;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

import com.cci.workers.*;

public class Enterprise implements Printable {
	// Constructor
	public Enterprise(String enterpriseName)
	{
		this.enterpriseName = enterpriseName;
	}
	
	
	// Variables
	private SortedMap<Integer, Printable> listWorkers = new TreeMap<>();
	public final String enterpriseName;
	
	
	// Methods
	public void addWorker(Printable somebody)
	{
		if (listWorkers.isEmpty())
		{
			listWorkers.put(0, somebody);
			return;
		}
		
		Integer lastID = listWorkers.lastKey();
		listWorkers.put(++lastID, somebody);
	}
	
	public Printable getWorkerByID(Integer number)
	{
		return listWorkers.get(number);
	}
	
	public Printable removeWorkerByID(Integer number)
	{
		return listWorkers.remove(number);
	}
	
	public void printSelf()
	{
		System.out.println("To print the web version, please press 'w'. Otherwise, enter anything else.");
		Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("w"))
        {
        	printWeb(this);
        } else {
        	print(this);
		}	
	}
	
	public static void print(Enterprise business)
	{
		System.out.println("Great Report");
		System.out.println("------------");
		System.out.println("");
		
		SortedMap<Integer, Printable> workerList = business.getListWorkers();
		
		Integer index = 0;
		
		for(var entry : workerList.entrySet())
		{
			Integer ID = entry.getKey();
			Printable somebody = entry.getValue();
			
			System.out.println("Worker n°:" + ID);
			somebody.printSelf();
			System.out.println();
			
			if ((++index % 3) == 0 || workerList.size() == index)
			{
				System.out.println("Page " + (int) Math.ceil(index/3.f));
				System.out.println("");
			}
		}
	}
	
	public static void printWeb(Enterprise business)
	{
		System.out.println("Great Report");
		System.out.println("------------");
		System.out.println("");
		
		SortedMap<Integer, Printable> workerList = business.getListWorkers();
		
		Integer index = 0;
		
		for(var entry : workerList.entrySet())
		{
			Integer ID = entry.getKey();
			Printable somebody = entry.getValue();
			
			System.out.println("Worker n°:" + ID);
			somebody.printSelf();
			System.out.println();
			
			if ((++index % 2) == 0 || workerList.size() == index)
			{
				System.out.println("Use an API, and you will be API-er lol");
				System.out.println("");
			}
		}
	}
	
	
	// Getters & Setters
	public SortedMap<Integer, Printable> getListWorkers()
	{
		return listWorkers;
	}
}
