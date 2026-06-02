package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public void saveEmployee(Employee e) {
		entityManager.persist(e);
	}

	@Override
	public List<Employee> getAllEmployees() {
		Query query = entityManager.createQuery("from Employee");
		List<Employee> li = query.getResultList();
		return li;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee emp = entityManager.find(Employee.class, id);
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee e) {

		return entityManager.merge(e);
	}

	@Override
	public void deleteEmployee(Employee e) {
		entityManager.remove(e);

	}

}
