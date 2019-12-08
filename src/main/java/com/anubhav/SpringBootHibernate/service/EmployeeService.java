package com.anubhav.SpringBootHibernate.service;

import java.util.List;

import com.anubhav.SpringBootHibernate.model.Employee;

public interface EmployeeService {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
