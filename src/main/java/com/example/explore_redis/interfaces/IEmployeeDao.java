package com.example.explore_redis.interfaces;

import java.util.Map;

import com.example.explore_redis.model.Employee;

public interface IEmployeeDao {
	void saveEmployee(Employee emp);
    Employee getOneEmployee(Integer id);
    void updateEmployee(Employee emp);
    Map<Integer, Employee> getAllEmployees();
    void deleteEmployee(Integer id);
    void saveAllEmployees(Map<Integer, Employee> map);
}
