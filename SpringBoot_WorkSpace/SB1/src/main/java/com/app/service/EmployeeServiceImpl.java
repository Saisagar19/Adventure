package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	@Transactional
	public void saveEmployee(Employee e) {
		dao.saveEmployee(e);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee e) {
		return dao.updateEmployee(e);
	}

	@Override
	@Transactional
	public void deleteEmployee(Employee e) {
		dao.deleteEmployee(e);

	}

}
