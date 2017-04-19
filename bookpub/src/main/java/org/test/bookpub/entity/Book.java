package org.test.bookpub.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	private String isbn;
	private String title;
	private String description;
	@ManyToOne
	private Author author;
	@ManyToOne
	private Publisher publisher;
	@ManyToMany
	private List<Reviewer> reviewers;

	protected Book() {
	}

	public Book(String isbn, String title, Author author, Publisher publisher) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	//Skipping getters and setters to save space, but we do need them
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	public Publisher getPublisher() {
		return this.publisher;
	}
	
	public void setReviewers(List<Reviewer> reviewers) {
		this.reviewers = reviewers;
	}
	
	public List<Reviewer> getReviewers() {
		return this.reviewers;
	}
}
