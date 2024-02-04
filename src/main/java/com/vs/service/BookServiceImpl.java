package com.vs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.vs.entity.Book;
import com.vs.exception.BookNotFoundException;
import com.vs.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	private BookRepo bookRepo;

	@Autowired
	public BookServiceImpl(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Override
	public Book create(Book book) {
		return this.bookRepo.save(book);
	}

	@Override
	public List<Book> getAll() {
		return this.bookRepo.findAll();
	}

	@Override
	public Book get(int bookId) {
	    return this.bookRepo.findById(bookId)
	            .orElseThrow(() -> new BookNotFoundException("Book with ID " + bookId + " not found on the server."));
	}
	
	@Override
	public Book update(Book book) {
		return this.bookRepo.save(book);
	}
	
	@Override
	public String delete(int bookId) {
		
	     this.bookRepo.deleteById(bookId);
	     
	     Optional<Book> obj=this.bookRepo.findById(bookId);
	     System.out.println(obj.toString());
	     
	     if (obj.isEmpty()) {
	            return "Book deleted successfully";
	        } else {
	            return "Failed to delete book";
	        }
	}
	
	

}
