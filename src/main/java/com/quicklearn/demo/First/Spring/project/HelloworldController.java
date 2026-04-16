package com.quicklearn.demo.First.Spring.project;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	private MessageSource msgsource;
	

	public HelloworldController(MessageSource msgsource) {
		super();
		this.msgsource = msgsource;
	}

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
	

	@GetMapping(path = "/hello-world-int")
	public String hello_internationalized() {
		
		Locale locale = LocaleContextHolder.getLocale();
		return msgsource.getMessage("good.morning.message", null,"Default Message",locale);

	}
	
	
}
