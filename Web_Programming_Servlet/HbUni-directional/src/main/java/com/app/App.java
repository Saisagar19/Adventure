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
//		InstructorDetails insD = new InstructorDetails("Football", "GullyFootball");
//		Instructor ins = new Instructor("Sagar", "Ambekar", "sagar@gmail.com", insD);
//		session.persist(ins);
		
//		InstructorDetails insD1 = new InstructorDetails("Table Tenis", "TTYoo");
//		Instructor ins1 = new Instructor("Sahil", "Jadhav", "sahil@gmail.com", insD1);
//		session.persist(ins1);
		
//		InstructorDetails insD1 = new InstructorDetails("Cricket", "RealCricket");
//		Instructor ins1 = new Instructor("Amman", "Sayyed", "amman@gmail.com", insD1);
//		session.persist(ins1);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		Instructor ins1 = session.get(Instructor.class, id);
		session.remove(ins1);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
