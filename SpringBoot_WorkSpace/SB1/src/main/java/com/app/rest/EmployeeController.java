package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee theEmployee) {
		employeeService.saveEmployee(theEmployee);
		return theEmployee;
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
		Employee e = employeeService.getEmployeeById(id);
		if (e == null) {
//			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok().build();
		}
	}

	@PutMapping("/employees")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee theEmployee) {

		Employee e = employeeService.getEmployeeById(theEmployee.getId());
		if (e == null) {
			return new ResponseEntity<String>("Employee is Not Found", HttpStatus.NOT_FOUND);
		} else {
			employeeService.updateEmployee(theEmployee);
			return new ResponseEntity<String>("Employee is updated", HttpStatus.FOUND);
		}
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
		Employee e = employeeService.getEmployeeById(id);

		if (e == null) {
			return ResponseEntity.noContent().build();
		} else {
			employeeService.deleteEmployee(e);
			return ResponseEntity.ok().build();
		}
	}

}
