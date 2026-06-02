package com.app.dao;

import java.util.List;

import com.app.entity.Book;

public interface BookDAO {
	 
    public List<Book> getBooks();
 
    public void saveBook(Book book);
 
    public Book getBook(int theId);
 
    public void deleteBook(int theId);
}
