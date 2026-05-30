package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
//	@RequestMapping(path = "/studentForm", method = RequestMethod.GET)
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("theStudent", theStudent);
		return "student-form";
	}

//	@RequestMapping(path="/processForm", method = RequestMethod.POST)
	@PostMapping("/processForm")
	public String processForm(@ModelAttribute("theStudent") Student student) {
		System.out.println("Student Confirmed: " + student);
		return "student-confirmation";
	}

}
