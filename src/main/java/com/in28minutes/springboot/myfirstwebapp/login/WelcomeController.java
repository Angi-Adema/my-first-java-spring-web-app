package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
// In order to put an attribute into session, we use @SessionAttributes and specify what we are wanting to put into Session. In this case "name". We see it put into the model below, we also need to add
// this to all the controllers where we want to make use of that value. (Store a value in session and use it so it persists across multiple pages or HTTP requests.)
@SessionAttributes("name")
// Since we changed the method below to gotoWelcomePage, we have updated the class name to WelcomeController.
public class WelcomeController {
	
	//login
	// To start, this method is handling both the GET and POST requests.
	// In order to utilize Spring security, we change value="login" to value="/", pass in the ModelMap model into the method and add the model.put line.
	@RequestMapping(value="/", method = RequestMethod.GET)   // To make this only handle the GET request, we added value= and the , method = RequestMethod.GET. For the POST we add the method below.
	public String gotoWelcomePage(ModelMap model) {    // For Spring security we changed "loginPage" to gotoWelcomePage.
		model.put("name", getLoggedinUsername());    // Instead of having model.put("name", "in28minutes"); change to a call to authentication below.
		
		// For Spring security we want to change return "login" to return "welcome" to send them to the welcome page.
		return "welcome";
	}
	
	// Rather than have the username hard coded in the model, we would rather get this from Spring security:
	private String getLoggedinUsername() {
		
		// Set up authentication details.
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		// From the authentication details we can get the user details.
		return authentication.getName();
	}
}



// NONE OF THIS LOGIC IS NEEDED ANY MORE AS SPRING WILL HANDLE AUTHENTICATION.

// Make use of our AuthenticationService. There is an error when we try to run the page because this is not initialized and is returning null.
// Since we are using Spring we do not want to tie it up with an instance. We want to set it up so Spring takes care of it using constructor injection per the constructor below. 
// private AuthenticationService authenticationService = new AuthenticationService();
//     private AuthenticationService authenticationService;

// 
//     public LoginController(AuthenticationService authenticationService) {
	//     super();
	//     this.authenticationService = authenticationService;
//}

// @RequestMapping(value="login", method = RequestMethod.POST)
////Now that the login page takes us to the welcome page, we want to capture the user name and password details. Use RequestParam for query params and form data.
////We also have to pass them to the welcome page, in order to do this we have to use a ModelMap. Following the model view controller pattern to store the name and password in the view.
//public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//	
//	if(authenticationService.authenticate(name, password)) {
//	
//		model.put("name", name);
//		//model.put("password", password);
//	
//		// We want to add Authentication logic (new class) and once a name and password is entered we want to redirect them to the welcome page, otherwise send them back to the login page.
//		// name - in28minutes
//		// password - dummy
//	
//		return "welcome";
//	}
//	// If authentication is incorrect, we need to provide an error message to the user. Make use of the model and pass info from the controller to the view. 
//	// Now that it is in the model, we can make use of it in the JSP.
//	model.put("errorMessage", "Invalid Credentials! Please try again.");
//	// Getting error on line 28 because we need to tell it what to do if authentication is not valid with "return 'login'".
//	return "login";
//}



// Make this LoginController pass in a name.
// http://localhost:8080/login?name=Ranga
// Whenever you want to pass anything from your controller to your jsp, we do this by putting it into a Model. Pass in a ModelMap and add to that ModelMap and use the value in the JSP.
// Anything you want to make available to the view, you put it in the model.
//@Controller
//public class LoginController {
	
	//private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	//@RequestMapping("login-jsp")
	//@RequestMapping("login")
	//public String loginPage(@RequestParam String name, ModelMap model) {
		
		//model.put("name", name);
		//logger.debug("Request param is {}", name);
		//logger.info("I want this printed at info level");
		//logger.warn("I want this printed at warn level");
		//System.out.println("Request param is " + name);  // NOT RECOMMENDED FOR PRODUCTION CODE USE LOGGER INSTEAD
		
		//return "login";  
	//}

//}

// Using @RequestParam allows access to the params passed into the URL when visiting the URL.