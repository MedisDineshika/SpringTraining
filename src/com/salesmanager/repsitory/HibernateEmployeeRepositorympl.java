package com.salesmanager.repsitory;

import java.util.ArrayList;
import java.util.List;

import com.salesmanager.model.Employee;

public class HibernateEmployeeRepositorympl implements EmployeeRepository {
	
	
	public List<Employee> getAllEmployees(){
		
		List<Employee>employees = new ArrayList<>();
		
		Employee employee = new Employee ();
		
		
		employee.setEmployeeName("Sema");
		employee.setEmployeeLocation("Thalangama");
		
		employees.add(employee);
		
		
		
		 
		
		return employees;
		
		
		
		
		
		
	}

}
