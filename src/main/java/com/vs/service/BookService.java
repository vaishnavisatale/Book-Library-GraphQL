package com.vs.service;

import com.vs.entity.Book;
import java.util.*;

public interface BookService 
{
	
    Book create(Book book);

    List<Book> getAll();

    Book get(int bookId);
    
    Book update(Book book);
    
    String delete(int id);

}
