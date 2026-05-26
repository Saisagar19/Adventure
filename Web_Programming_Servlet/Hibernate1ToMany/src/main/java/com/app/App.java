package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		Instructor ins = new Instructor("Sagar", "Ambekar", "sagar@gmail.com");
		InstructorDetails insD = new InstructorDetails("Football", "GullyFootball",ins);
		ins.setInstructorDetails(insD);
		session.persist(insD);

		int id = 1;
		Instructor ins5 = session.get(Instructor.class, id);

		Course c1 = new Course("Java");
		Course c2 = new Course("Python");
		Course c3 = new Course("DSA");

		ins5.add(c1);
		ins5.add(c2);
		ins5.add(c3);

		session.persist(c1);
		session.persist(c2);
		session.persist(c3);

		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
