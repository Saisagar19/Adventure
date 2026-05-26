package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Book;

public class BookDao {

	private static SessionFactory factory = null;
	private static Session session = null;

	public static Session getSession() {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
				.buildSessionFactory();
		session = factory.openSession();
		return session;
	}
	
	public static int saveBook(Book book)
	{
		System.out.println(book);
		session = getSession();
		session.beginTransaction();
		int i = (int) session.save(book);
		System.out.println(i);
		session.getTransaction().commit();
		destroy();
		return book.getId();
	}
	
	public static void destroy()
	{
		session.close();
		factory.close();
	}

}
