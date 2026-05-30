package com.app.entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

//@Data
public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private Map<String, String> countryOptions;
	private String favouriteLanguage;
	private String[] operatingSystems;

	public Student() {
		countryOptions = new HashMap<String, String>();
		countryOptions.put("IN", "INDIA");
		countryOptions.put("FR", "FRANCE");
		countryOptions.put("UK", "UNITED_KINGDOM");
		countryOptions.put("BR", "BRAZIL");
		countryOptions.put("DE", "GERMANY");
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", countryOptions=" + countryOptions + ", favouriteLanguage=" + favouriteLanguage
				+ ", operatingSystems=" + Arrays.toString(operatingSystems) + "]";
	}
	
	

}
