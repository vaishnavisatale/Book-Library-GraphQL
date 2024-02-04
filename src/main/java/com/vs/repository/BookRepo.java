package com.vs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vs.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
