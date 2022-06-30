package com.mysite.main;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/users/{id}")
	Optional<User> getUserById(@PathVariable Long id){
		return userRepository.findById(id);
	}
	
	//sign up form operation
	@PostMapping("/users")
	User newUser(@RequestBody User user){
		return userRepository.save(user);
	}
	
	@DeleteMapping("/users/{id}")
	void deleteUserById(@PathVariable Long id){
		userRepository.deleteById(id);
	}
	
	@PutMapping("/users/{id}")
	User updateUser(@PathVariable Long id, @RequestBody User newuser){
		return userRepository.findById(id).map(
				user -> {
					user.setName(newuser.getName());
					return userRepository.save(user);
				}).orElseGet(() -> {
					newuser.setId(id);
					return userRepository.save(newuser);
				});
	}
	

	
}
