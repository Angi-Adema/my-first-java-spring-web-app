package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")  // All attributes with the name "name" will be accessible by the Model as well.
public class TodoController {
	
	//We want to make use of TodoService.
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	// URL we want to use for the TODOs is /list-todos
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("in28minutes");
		model.addAttribute("todos", todos);
		
		return "listTodos";
	}
	
	// Add the functionality to the "Add TODO" button with this method below.
	// This method is handling the GET, POST, etc. any request type. To have it handle separately the GET and POST functions, we add a request method using "value" & "method below.
	@RequestMapping(value="add-todo", method = RequestMethod.GET)
	public String showNewTodoPage() {
		return "todo";
	}
	
	// Add the POST method.
	// We want to also redirect to the listTodos above rather than copying all the code from above and putting it into this method.
	@RequestMapping(value="add-todo", method = RequestMethod.POST)
	// Use @RequestParam to capture the data entered for the TODO and store it and move all the logic out to the TodoService in the TodoController.
	public String addNewTodo(@RequestParam String description) {
		return "redirect:list-todos";
	}
}
