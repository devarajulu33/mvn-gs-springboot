package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="person", method = RequestMethod.GET)
	public String index(@RequestParam("Name") String name) {
		return "Hello "+name+" from Spring Boot!";
	}

}
