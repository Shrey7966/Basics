package com.quicklearn.demo.First.Spring.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quicklearn.demo.First.Spring.project.users.PersonName;
import com.quicklearn.demo.First.Spring.project.users.Personv2;
import com.quicklearn.demo.First.Spring.project.users.PersonvV1;

@RestController
public class PersonVersionController {
	
	@GetMapping("/v1/person")
	public PersonvV1 personv1() {
		return new PersonvV1("Shreyas");
	}
	
	@GetMapping("/v2/person")
	public Personv2 personv2() {
		return new Personv2(new PersonName("Shreyas","Gangadhar"));
	}
	
	@GetMapping(path = "/person" , params = "version=1")
	public PersonvV1 personv1UsingReqParam() {
		return new PersonvV1("Shreyas");
	}
	
	@GetMapping(path = "/person" , params = "version=2")
	public Personv2 personv2UsingReqParam() {
		return new Personv2(new PersonName("Shreyas","Gangadhar"));
	}

}
