package com.anubhav.SpringBootHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anubhav.SpringBootHibernate.model.Employee;
import com.anubhav.SpringBootHibernate.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empServce;

	
	@GetMapping(path = "/")
	public String mainPage(){
		return "Hello world - this is main";	
	}
	
	@GetMapping(path = "test")
	public String showString(){
		return "Hello world - this is test";	
	}


	@GetMapping(path = "employee") 
	public List<Employee> get(){ return
			empServce.get();

	}


	@PostMapping(path = "employee") 
	public String save(@RequestBody Employee
			emp){

		empServce.save(emp); System.out.println("Success"); return "Yess!";

	}

	@GetMapping(path = "employee/{id}") 
	public Employee get(@PathVariable int
			id){ return empServce.get(id);

	}

	@DeleteMapping(path = "employee/{id}") 
	public String delete(@PathVariable int
			id){ empServce.delete(id); return "Employee deleted!"; }

}

