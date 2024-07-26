package com.pact.bookselling.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "Book")
public class Book {
	
	

	public Book( String author, String title,String genre,double price) {
		super();
	
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.author = author;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_sequence")
	private Long id;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Genre")
	private String genre;
	
	@Column(name = "Price")
	private double price;
	
	@Column(name = "Author")
	private String author;
	
	

}
