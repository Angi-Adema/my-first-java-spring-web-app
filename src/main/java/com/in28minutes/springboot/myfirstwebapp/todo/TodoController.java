package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	// Since we are using form library, we have to update this method to send the attribute call into the model instead of directing the page. Added the model into the showNewTodoPage method call.
	@RequestMapping(value="add-todo", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = (String)model.get("name");
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		// Put this Bean into model (copy model attribut name from todo.jsp).
		model.put("todo", todo);
		return "todo";
	}
	
	// Add the POST method.
	// We want to also redirect to the listTodos above rather than copying all the code from above and putting it into this method.
	// When using a Command Bean or Form Backing Object, instead of binding the user data to this Request Param in this method, we can bind the data directly to the Todo.java bean. As such, we do not
	// need to make any changes to the binding in this method as it is being bound directly. To bind directly, we remove "@RequestParam String description" and add in "Todo todo". Binds directly to the
	// Todo Bean. Also update "description" to todo.getDescription() to call this method in the Todo Bean.
	// We also need to make use of the form backing object of "Todo todo" in the todo.jsp as well. Make use of Spring Form Tag Libraries via Google search.
	@RequestMapping(value="add-todo", method = RequestMethod.POST)
	// Use @RequestParam to capture the data entered for the TODO and store it and move all the logic out to the TodoService in the TodoController.
	public String addNewTodo(ModelMap model, Todo todo) {
		String username = (String)model.get("name");
		todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
}
