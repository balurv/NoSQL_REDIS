package com.example.explore_redis.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//No @Entity concept here
public class Employee implements Serializable {

	public Employee(int i, String string, double d) {
		this.empId = i;
		this.empName = string;
		this.empSalary = d;
	}

	private static final long serialVersionUID = -7817224776021728682L;

	private Integer empId;
	private String empName;
	private Double empSalary;

	
	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}