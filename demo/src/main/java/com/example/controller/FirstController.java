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
	//helo

	@GetMapping("/{name}")
	public Employee getEmployeePP(@PathVariable String name) {

		Employee e1 = new Employee("venkat", 30);
		Map<String, Employee> mp1 = new HashMap<>();
		mp1.put("venkat", e1);
		return mp1.get("venkat");

	}
	@GetMapping("/")
	public Employee getEmployeeRP(@RequestParam(value="name" )String name) {

		Employee ee = new Employee("venkat", 30);
		Map<String, Employee> mpp = new HashMap<>();
		mpp.put("venkat", ee);
		return mpp.get("venkat");

	}
}
