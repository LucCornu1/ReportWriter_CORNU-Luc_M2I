package com.cci.company;

import java.util.SortedMap;
import java.util.TreeMap;

import com.cci.workers.*;

public class Enterprise {
	// Constructor
	public Enterprise(String enterpriseName)
	{
		this.enterpriseName = enterpriseName;
	}
	
	
	// Variables
	private SortedMap<Integer, Worker> listWorkers = new TreeMap<>();
	public final String enterpriseName;
	
	
	// Methods
	public void addWorker(Worker somebody)
	{
		if (listWorkers.isEmpty())
		{
			listWorkers.put(0, somebody);
			return;
		}
		
		Integer lastID = listWorkers.lastKey();
		listWorkers.put(++lastID, somebody);
	}
	
	public Worker getWorkerByID(Integer number)
	{
		return listWorkers.get(number);
	}
	
	public Worker removeWorkerByID(Integer number)
	{
		return listWorkers.remove(number);
	}
	
	
	// Getters & Setters
	public SortedMap<Integer, Worker> getListWorkers()
	{
		return listWorkers;
	}
}
