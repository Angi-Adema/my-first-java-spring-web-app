package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

// Where do we store these details? In a database. We will need to create a database.
// First create a static list of TODOs (TodoService class). Then utilize a database (H2, MySQL)

public class Todo {
	// Things we want to store:
	// id
	// username
	// description of TODO
	// targetDate
	// completed

	private int id;
	private String username;
	
	// Set validation on the description and produce message when the data entered fails this parameter. From Jakarta.validation-api, 
	//can see all of the things we can use in here by opening this file in Maven dependencies.
	@Size(min=10, message="Enter at least 10 characters.")
	private String description;
	private LocalDate targetDate;
	private boolean done;

	public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}

}
