package com.example.explore_redis.repository;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;

import com.example.explore_redis.interfaces.IEmployeeDao;
import com.example.explore_redis.model.Employee;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	private final String hashReference= "Employee";

    @Resource(name="redisTemplate")          // 'redisTemplate' is defined as a Bean in AppConfig.java
    private HashOperations<String, Integer, Employee> hashOperations;

    @Override 
    public void saveEmployee(Employee emp) {
        //creates one record in Redis DB if record with that Id is not present
        hashOperations.putIfAbsent(hashReference, emp.getEmpId(), emp);// it's working fine.. don't panic
        // need to need lombok plugins in eclipse
    }

    @Override
    public void saveAllEmployees(Map<Integer, Employee> map) {
        hashOperations.putAll(hashReference, map);
    }

    @Override
    public Employee getOneEmployee(Integer id) {
       return hashOperations.get(hashReference, id);
    }

    @Override
    public void updateEmployee(Employee emp) {
       hashOperations.put(hashReference, emp.getEmpId(), emp);// it's working fine.. don't panic
       // need to need lombok plugins in eclipse
    }

    @Override
    public Map<Integer, Employee> getAllEmployees() {
       return hashOperations.entries(hashReference);
    }

    @Override
    public void deleteEmployee(Integer id) {
       hashOperations.delete(hashReference, id);
    }
}
