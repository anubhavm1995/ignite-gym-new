package com.anubhav.SpringBootHibernate.dao;

import java.util.List;

import com.anubhav.SpringBootHibernate.model.*;
public interface EmployeeDAO {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);

	
	
}
