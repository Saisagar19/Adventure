package com.app.dao;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Book;
import com.app.util.HibernateConnection;

public class BookDAO {

	public static boolean saveBook(Book b) {

		try (Session session = HibernateConnection.openSession()) {
			session.beginTransaction();
			session.persist(b);
			session.beginTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static List<Book> getAllBooks() {
		try (Session session = HibernateConnection.openSession()) {

			return session.createQuery("from Book", Book.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	public static Book getBookById(int id) {
		try (Session session = HibernateConnection.openSession()) {
			return session.get(Book.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static boolean updateBook(Book book) {
		Transaction tx = null;
        try (Session session = HibernateConnection.openSession()) {
            tx = session.beginTransaction();
            session.merge(book);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null)
            e.printStackTrace();
            return false;
        }
	}

	public static boolean deleteBook(int id) {
		Transaction tx = null;
        try (Session session = HibernateConnection.openSession()) {
            tx = session.beginTransaction();
            Book book = session.get(Book.class, id);
            if (book == null) {
                return false;  // FIX: Nothing to delete — return false gracefully
            }
            session.remove(book);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }

	}

	public static long getTotalBooks() {
		try (Session session = HibernateConnection.openSession()) {
            return session.createQuery("SELECT COUNT(b) FROM Book b", Long.class).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
	}

}
