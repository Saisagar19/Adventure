package com.app;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using vodafone");

	}

	@Override
	public void data() {
		System.out.println("browsing data using vodafone sim");

	}

	public Vodafone() {
		System.out.println("Default constructor of voda called");
	}

}
