package com.app.dao;

import java.util.List;

import com.app.entity.Employee;

public interface EmployeeDao {

	public void saveEmployee(Employee e);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int id);

	public Employee updateEmployee(Employee e);

	public void deleteEmployee(Employee e);

}
