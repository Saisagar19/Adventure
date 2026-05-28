package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Employee employee = context.getBean("emp" , Employee.class);
		Employee emp = context.getBean(Employee.class, "emp");
		System.out.println(emp);
		
	}
}
