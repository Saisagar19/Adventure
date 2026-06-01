package com.app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.app.model.Student;

import tools.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) {

//		Reading the data from JSON to Java Console
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(new File("data/sample.json"), Student.class);
		System.out.println(student);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter FirstName : ");
		String fname = sc.nextLine();
		System.out.println("Enter LastName : ");
		String lname = sc.nextLine();
		System.out.println("Enter Active Status : ");
		boolean status = sc.nextBoolean();

		Student st = new Student();
		st.setId(id);
		st.setFirstName(fname);
		st.setLastName(lname);
		st.setActive(status);

		System.out.println(st);

		ObjectMapper map = new ObjectMapper();
		map.writeValue(new File("data/sample2.json"), st);
		System.out.println("data written successfully");
	}

}
