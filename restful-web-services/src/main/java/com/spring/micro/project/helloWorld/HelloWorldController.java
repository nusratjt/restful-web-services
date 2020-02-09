package com.spring.micro.project.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	//@RequestMapping(method=RequestMethod.GET, path = "")
	@GetMapping(path = "")
	public String helloWorld() {
		
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-World-Bean")
	public HelloWorldBean helloWorldBean() {
		//throw new RuntimeException("Some error has happened!!");
		return new HelloWorldBean("Hello World - Changed");
	}
	
	//hello-World/Path-variable/nusrat
	@GetMapping(path = "/hello-World/Path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	

}
