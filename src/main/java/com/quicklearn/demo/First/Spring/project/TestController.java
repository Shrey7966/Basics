package com.quicklearn.demo.First.Spring.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quicklearn.demo.First.Spring.project.dao.UserDaoService;

@RestController
public class TestController {
	
	@Autowired
	private UserDaoService service;
	
	@PostMapping("/users/{id}")
	public void postuserdetails(@PathVariable int id) {
		service.deleteById(id);
	}

}
