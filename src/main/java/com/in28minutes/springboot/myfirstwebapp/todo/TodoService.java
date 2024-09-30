package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	// Create list of TODOs.
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "in28minutes", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "in28minutes", "Learn CloudDevelopment", LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		// If the todo.getId() is equal to the id we wish to delete or id passed in here.
		// Use lambda expression: name of the bean -> condition you want to check. (todo -> todo.getId() == id)
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
}
