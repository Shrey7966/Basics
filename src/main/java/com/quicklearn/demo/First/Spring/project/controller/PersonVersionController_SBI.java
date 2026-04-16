package com.quicklearn.demo.First.Spring.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quicklearn.demo.First.Spring.project.users.PersonName;
import com.quicklearn.demo.First.Spring.project.users.Personv2;
import com.quicklearn.demo.First.Spring.project.users.PersonvV1;

@RestController
public class PersonVersionController_SBI {
	
	@GetMapping(value  = "/{version}/personsbi", version = "1.0.0")
	public PersonvV1 personv1() {
		return new PersonvV1("Shreyas");
	}
	
	@GetMapping("/v2/personsb1")
	public Personv2 personv2() {
		return new Personv2(new PersonName("Shreyas","Gangadhar"));
	}
	
	@GetMapping(path = "/personsb1" , params = "version=1")
	public PersonvV1 personv1UsingReqParam() {
		return new PersonvV1("Shreyas");
	}
	
	@GetMapping(path = "/personsb1" , params = "version=2")
	public Personv2 personv2UsingReqParam() {
		return new Personv2(new PersonName("Shreyas","Gangadhar"));
	}

}
