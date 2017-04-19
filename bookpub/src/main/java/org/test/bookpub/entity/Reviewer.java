package org.test.bookpub.entity;

import javax.persistence.*;

@Entity
public class Reviewer {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;

	protected Reviewer() {
	}

	public Reviewer(String firstName, String lastName) {
		// Skipping implementation to save space
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setId(Long id) {
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
