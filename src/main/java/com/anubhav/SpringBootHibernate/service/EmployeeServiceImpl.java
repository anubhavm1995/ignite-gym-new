package com.anubhav.SpringBootHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anubhav.SpringBootHibernate.dao.EmployeeDAO;
import com.anubhav.SpringBootHibernate.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO empDAO;
	
	@Transactional
	@Override
	public List<Employee> get() {
		return empDAO.get();
	}
	@Transactional
	@Override
	public Employee get(int id) {
		return empDAO.get(id);
	}
	@Transactional
	@Override
	public void save(Employee employee) {
		empDAO.save(employee);
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		empDAO.delete(id);
		
	}

}
