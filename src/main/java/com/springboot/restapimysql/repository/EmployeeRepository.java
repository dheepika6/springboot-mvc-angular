package com.springboot.restapimysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restapimysql.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
