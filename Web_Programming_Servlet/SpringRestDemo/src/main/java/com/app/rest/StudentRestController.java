package com.app.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	List<Student> list = null;

	public StudentRestController() {
		list = new ArrayList<Student>();
		list.add(new Student(1, "Sahil", "jadhav", true));
		list.add(new Student(2, "Sagar", "Ambekar", false));
		list.add(new Student(3, "Ankit", "Patle", true));
		list.add(new Student(4, "Yuv", "Kadam", false));

	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return list;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return list.get(id);
	}

}
