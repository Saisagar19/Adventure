package com.app.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Book;

public class HibernateConnection {

	public static SessionFactory factory;

	static {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();
	}

	public static Session openSession() {
		return factory.openSession();
	}

	public static void close() {
		if (factory != null && !factory.isClosed()) {
			factory.close();
		}
	}

}
