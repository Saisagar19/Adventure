package com.app.service;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomers(Customer customer);

	public Customer getCustomerById(int theId);

	public void deleteCustomer(int theId);

}
