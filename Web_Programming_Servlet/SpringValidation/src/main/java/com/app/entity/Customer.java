package com.app.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
	private String firstName;
	@NotNull
	@Size(min = 1, message = "At Least enter 1 character")
	private String lastName;

	public Customer() {
	}

	public Customer(String firstName, @NotNull @Size(min = 1, message = "At Least enter 1 character") String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
