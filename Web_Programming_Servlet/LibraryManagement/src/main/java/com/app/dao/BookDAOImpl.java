package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Book;

@Repository
public class BookDAOImpl implements BookDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    @Override
    public List<Book> getBooks() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book", Book.class);
        return query.list();
    }
 
    @Override
    public void saveBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(book);
    }
 
    @Override
    public Book getBook(int theId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Book.class, theId);
    }
 
    @Override
    public void deleteBook(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Book theBook = session.get(Book.class, theId);
        if (theBook != null) {
            session.remove(theBook);
        }
    }
}
