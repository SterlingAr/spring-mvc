package com.bookstore.domain.repository;

import java.io.Serializable;
import java.util.UUID;

public class Author implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4797541796780299962L;
	private UUID authorId;
	private String firstName;
	private String lastName;
	private int age;
	private String biography;
	
	public Author(){}
	
	public Author(String firstName, String lastName, int age, String biography) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.biography = biography;
		authorId= UUID.randomUUID();
	}

	public Author(UUID authorId, String firstName, String lastName, int age, String biography) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.biography = biography;
	}

	public UUID getAuthorId() {
		return authorId;
	}

	public void setAuthorId(UUID authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	

	

}
