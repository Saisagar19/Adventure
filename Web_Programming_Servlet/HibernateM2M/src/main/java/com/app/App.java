package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();

		Course c1 = new Course("Microservices");
		Course c2 = new Course("Python");
		Course c3 = new Course("Java");
		session.save(c1);
		session.persist(c2);
		session.save(c3);

		Student st = new Student("Sagar", "Ambekar", "sagar@gmail.com");
		st.add(c3);
		st.add(c1);
		st.add(c2);

		session.persist(st);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}
}
