package com.salesmanager.service;

import java.util.List;

import com.salesmanager.model.Employee;
import com.salesmanager.repsitory.EmployeeRepository;
import com.salesmanager.repsitory.HibernateEmployeeRepositorympl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository = new HibernateEmployeeRepositorympl();
	
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
		
		
		
		
	}
}
