package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Employee;

@RequestMapping("/employee")
@RestController
public class FirstController {

	@GetMapping("/{name}")
	public Employee getEmployeePP(@PathVariable String name) {

		Employee e = new Employee("venkat", 30);
		Map<String, Employee> mp = new HashMap<>();
		mp.put("venkat", e);
		return mp.get("venkat");

	}
	@GetMapping("/")
	public Employee getEmployeeRP(@RequestParam(value="name" )String name) {

		Employee e = new Employee("venkat", 30);
		Map<String, Employee> mp = new HashMap<>();
		mp.put("venkat", e);
		return mp.get("venkat");

	}
}
