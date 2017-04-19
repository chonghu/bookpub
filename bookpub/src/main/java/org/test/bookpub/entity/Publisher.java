package org.test.bookpub.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Publisher {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany(mappedBy = "publisher")
	private List<Book> books;

	protected Publisher() {
	}

	public Publisher(String name) {
		this.name = name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}