package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Employee;

@RestController
@RequestMapping(value="/post")
public class PostController {
	
	@PostMapping(value="/method1")
	public Employee saveEmployee(@RequestBody Employee e) {
		System.out.println("In the save method helo");
		System.out.println(" "+e.getName());
		System.out.println(" "+e.getAge());
		return e;
		
	}

}
