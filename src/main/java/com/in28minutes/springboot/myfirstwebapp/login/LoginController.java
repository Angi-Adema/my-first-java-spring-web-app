package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Make this LoginController pass in a name.
// http://localhost:8080/login?name=Ranga
// Whenever you want to pass anything from your controller to your jsp, we do this by putting it into a Model. Pass in a ModelMap and add to that ModelMap and use the value in the JSP.
// Anything you want to make available to the view, you put it in the model.
@Controller
public class LoginController {
	@RequestMapping("login-jsp")
	public String loginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		System.out.println("Request param is " + name);  // NOT RECOMMENDED FOR PRODUCTION CODE
		return "login";  
	}

}
