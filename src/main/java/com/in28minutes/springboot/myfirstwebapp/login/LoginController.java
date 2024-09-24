package com.in28minutes.springboot.myfirstwebapp.login;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	//login
	@RequestMapping("login")
	public String loginPage() {
		
		return "login";
	}
}



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