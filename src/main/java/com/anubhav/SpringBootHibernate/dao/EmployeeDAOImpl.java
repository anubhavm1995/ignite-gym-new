package com.anubhav.SpringBootHibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anubhav.SpringBootHibernate.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<Employee> get() {
		Session crntSession = entityManager.unwrap(Session.class);
		Query<Employee> query = crntSession.createQuery("from Employee WHERE DEPARTMENT = 'ECE'",Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		Session crntSession = entityManager.unwrap(Session.class);
		Employee emp = crntSession.get(Employee.class, id);

		return emp;
	}

	@Override
	public void save(Employee employee) {
		Session crntSession = entityManager.unwrap(Session.class);
		
		crntSession.save(employee);
		System.out.println(employee.toString());
		
	}

	@Override
	public void delete(int id) {
		Session crntSession = entityManager.unwrap(Session.class);
		Employee emp = crntSession.get(Employee.class, id);
		crntSession.delete(emp);
		
		
	}

	
	
}
