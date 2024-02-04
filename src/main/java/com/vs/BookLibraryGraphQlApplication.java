package com.vs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vs.entity.Book;
import com.vs.service.BookService;

@SpringBootApplication
public class BookLibraryGraphQlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookLibraryGraphQlApplication.class, args);
	}
	
	
	
	@Autowired
    private BookService bookService;

    

    @Override
    public void run(String... args) throws Exception {
        Book b1 = new Book();
  

        b1.setTitle("Computer Organization and Design: The Hardware/Software Interface");
        b1.setDesc("This book provides a comprehensive introduction to computer architecture and organization. It covers the principles and design techniques used in modern computer systems.");
        b1.setPages(800);
        b1.setPrice(5000);
        b1.setAuthor("David A. Patterson, John L. Hennessy");

        Book b2 = new Book();
        b2.setTitle("Introduction to Algorithms");
        b2.setDesc("Known as \"CLRS,\" this book is a widely used textbook on algorithms. It covers fundamental algorithms and data structures used in computer science and engineering.");
        b2.setPages(1312);
        b2.setPrice(2000);
        b2.setAuthor("Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein");


        Book b3 = new Book();
        b3.setTitle("Computer Networks");
        b3.setDesc("This book is an authoritative introduction to computer networking. It covers the principles and protocols that govern the operation of computer networks, including the Internet.");
        b3.setPages(960);
        b3.setPrice(1000);
        b3.setAuthor("Andrew S. Tanenbaum");
        
        Book b4 = new Book();
        b4.setTitle("Digital Design: Principles and Practices");
        b4.setDesc("This book covers the fundamentals of digital design, including both combinational and sequential logic. It is a valuable resource for students and professionals in digital systems design.");
        b4.setPages(784);
        b4.setPrice(1000);
        b4.setAuthor("John F. Wakerly");
        
        Book b5 = new Book();
        b5.setTitle("Artificial Intelligence: A Modern Approach");
        b5.setDesc("Widely used as a textbook, this book provides a comprehensive introduction to the field of artificial intelligence. It covers various AI techniques and applications");
        b5.setPages(1152);
        b5.setPrice(3000);
        b5.setAuthor("Stuart Russell, Peter Norvig");

        this.bookService.create(b1);
        this.bookService.create(b2);
        this.bookService.create(b3);
        this.bookService.create(b4);
        this.bookService.create(b5);
    }


}
