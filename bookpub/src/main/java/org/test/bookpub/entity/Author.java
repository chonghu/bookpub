package org.test.bookpub.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Author {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy = "author")
	private List<Book> books;

	protected Author() {
	}

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Skipping implementation to save space, but we do need it all
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
}
