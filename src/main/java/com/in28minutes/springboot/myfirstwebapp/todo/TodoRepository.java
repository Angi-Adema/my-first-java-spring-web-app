// How do we implement CRUD logic for our JPA database? We create a repository to perform actions on entities. To name this file, use the name of the entity followed by the word "Repository".
// JpaRepository first item passed in is what Bean is it managing (Todo) and the second item passed in is the type of ID passed in but utilizing its wrapper class "Integer" for int.  

package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	
	// In order to search by a field, we add a method here to do so. Here we do a find by username and pass in that value. Because username is an attribute in the Todo Bean, Spring will automatically provide
	// a method to search by username. Now TODOs rendered are coming from the database.
	public List<Todo> findByUsername(String username);
}
