package com.example.explore_redis.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.explore_redis.model.Employee;
import com.example.explore_redis.service.EmployeeService;

@RestController
@RequestMapping("/EmployeeRedis")
public class EmployeeController {

	@Autowired
	EmployeeService employeService;
	
	@PostMapping
	public void createPerson(@RequestBody Employee emp) {
		employeService.save(emp);
	}
	
	@GetMapping
	public Map<Integer, Employee> getAllEmployees(){
		return employeService.getAllEmployees();
	}
}
