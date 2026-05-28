package com.app;

public class Jio implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling using jio");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing data using jio sim");
		
	}
	
	public Jio() {
		System.out.println("Default constructor of jio called");
	}

	
}
