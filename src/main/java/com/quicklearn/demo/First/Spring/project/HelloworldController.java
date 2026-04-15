package com.quicklearn.demo.First.Spring.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@GetMapping(path = "/hello-world")
	public String hello() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloworldBean() {
		return new HelloWorldBean("Hello Shreyas !!");
	}

	@GetMapping(path = "/hello-world-pathvariable/{name}")
	public HelloWorldBean helloworldBeanPathVariable(@PathVariable String name) {
		return new HelloWorldBean("Hello!" + name);
	}
}
