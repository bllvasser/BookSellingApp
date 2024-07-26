package com.pact.bookselling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pact.bookselling.entity.Book;
import com.pact.bookselling.repository.BookRepository;

@SpringBootApplication
public class BookSellingAppApplication {
	
	@Autowired
	private BookRepository bRepo;
	
	


	public static void main(String[] args) {
		SpringApplication.run(BookSellingAppApplication.class, args);
		
		System.out.println("It's running");
	}
	
	@Bean
	CommandLineRunner runner() {
		
		return args -> {
			
			Book b = new Book("J.K.Rowling","Harry Potter & The Prisoner Of Azkaban", "Fiction", 19.99);
			bRepo.save(b);
			
			 b = new Book("Barry Eisler","RainFall", "Fiction", 14.99);
			bRepo.save(b);
			
			b = new Book("Stephen Kings","It", "Fiction", 14.99);
			bRepo.save(b);
			
			
		};
	}

}
