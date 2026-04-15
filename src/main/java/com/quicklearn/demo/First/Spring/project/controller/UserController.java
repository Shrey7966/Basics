package com.quicklearn.demo.First.Spring.project.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import com.quicklearn.demo.First.Spring.project.dao.UserDaoService;
import com.quicklearn.demo.First.Spring.project.users.User;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService service;
	
	
	@GetMapping("/users")
	public List<User> retreieveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/users/{id}")
	public User retreieveOneUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = service.saveUser(user);
		URI location = ServletUriComponentsBuilder
		.fromCurrentRequest()
		.path("/{id}")
		.buildAndExpand(savedUser.getId())
		.toUri();
		
		return ResponseEntity.created(location).build();
	}
}
