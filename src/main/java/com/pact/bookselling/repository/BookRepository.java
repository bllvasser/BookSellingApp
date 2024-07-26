package com.pact.bookselling.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pact.bookselling.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByTitle(String title);

}
