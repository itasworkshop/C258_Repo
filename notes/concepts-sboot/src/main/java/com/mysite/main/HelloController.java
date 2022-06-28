package com.mysite.main;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	String helloSpring() {
		return "Hello World Spring Discussion!!!!!!";
	}
	
	@RequestMapping("/profile")
	@ResponseBody
	String helloProfile() {
		return "this is profile page!!!";
	}
	
	@RequestMapping("/students/{name}")
	@ResponseBody
	String helloStudent(@PathVariable String name) {
		return "Hello "+ name +" Welcome to my spring app!";
	}

}
