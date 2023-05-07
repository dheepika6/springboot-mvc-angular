package com.springboot.restapimysql.service;

import java.util.List;

import com.springboot.restapimysql.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployee(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
}

