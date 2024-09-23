package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//This will not show up on the URL until we tell Spring that this is a Spring Bean. Add annotation below.
@Controller
public class SayHelloController {
	
	//Create a URL: "say-hello" and this should respond back a string: => "Hello! What are you learning today?"
	
	//How do we configure a URL of /say-hello? Use annotation provided by Spring! We are mapping this URL to this method.
	//When we hit this specific URL "say-hello" we return this specific string back. http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	//Will still get an error on the URL page because Spring is looking for a view with this specific string. Can't return the string as is, will be looking for a view with this specific name.
	@ResponseBody   //Will return the string in the return statement below as is to the browser.
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page - Changed </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body - Changed");
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}
}
