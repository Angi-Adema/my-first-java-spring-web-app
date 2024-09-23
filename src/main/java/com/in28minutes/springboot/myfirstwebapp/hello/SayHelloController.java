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
	
	//Since the above code is extremely tedious and not scalable over time, we create a view using the Spring JSP. Java Server Pages
	//Create a file called sayHello.jsp below. Can have multiple JSPs in here:
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
	//When a user hits the URL "say-hello-jsp" we want them to be redirected to sayHello.jsp containing the HTML info above.
	
	@RequestMapping("say-hello-jsp")
	// @ResponseBody  for jsp, we are mapping to the view jsp files so we do not want the response body any longer. This was to render the hard coded HTML above.
	public String sayHelloJsp() {
		//We do not want to return text as it will render exactly the text as it is in here.
		return "sayHello";  // The name of the JSP.
	}
	
}
