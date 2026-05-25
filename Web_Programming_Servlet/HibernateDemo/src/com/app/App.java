package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Student;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1. Get SessionFactory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// 2. Get Session
		Session session = factory.openSession();
		// 3. Begin Transaction
		session.beginTransaction();
		// a.Persist Student
//		Student student = new Student("Sagar", "Ambekar", "sagar@gmail.com");
//		session.persist(student);
		
		/*
		 * Student st = new Student(); st.setFirstName("Ankit");
		 * st.setLastName("Patle"); st.setEmail("ankit@gmail.com"); // session.save(st);
		 * session.persist(st);
		 */

		// b. Get Student on the basis of ID
		System.out.println("Enter ID: ");
		int id = scanner.nextInt();
		Student st1 = session.get(Student.class, id);
		System.out.println(st1);
//
//		// c. Update statement
//		System.out.println("Enter ID: ");
//		int id1 = scanner.nextInt();
//		Student st2 = session.get(Student.class, id1);
//		st2.setEmail("ankitKp@gmail.com");
////		session.update(st2);
//		session.merge(st2);
//
//		D. Delete statement
//		System.out.println("Enter ID: ");
//		int id2 = scanner.nextInt();
//		Student stud = session.get(Student.class, id2);
////		session.delete(stud);
//		session.remove(stud);

		session.getTransaction().commit();
		session.close();
		factory.close();
		scanner.close();
	}
}
