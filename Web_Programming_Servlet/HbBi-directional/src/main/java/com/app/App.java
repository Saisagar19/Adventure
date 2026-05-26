package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
//		Instructor ins = new Instructor("Sagar", "Ambekar", "sagar@gmail.com");
//		InstructorDetails insD = new InstructorDetails("Football", "GullyFootball",ins);
//		ins.setInstructorDetails(insD);
//		session.persist(insD);
		
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		Instructor ins1 = session.get(Instructor.class, id);
		InstructorDetails insD = session.get(InstructorDetails.class, id);
		session.remove(insD);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
