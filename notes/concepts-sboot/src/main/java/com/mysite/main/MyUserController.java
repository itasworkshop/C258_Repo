package com.mysite.main;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyUserController {
	
	
	private final UserRepository userRepository;
	
	MyUserController(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	List<User> getAll(){
		return userRepository.findAll();
	}

}
