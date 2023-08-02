package com.example.explore_redis.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.explore_redis.interfaces.IEmployeeDao;
import com.example.explore_redis.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	IEmployeeDao employeeDao;

	public void save(Employee e) {
		employeeDao.saveEmployee(e);
	}

	public Employee getEmployee(int id) {
		return employeeDao.getOneEmployee(id);
	}

	public Map<Integer, Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

}
