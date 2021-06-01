package com.hcl.SpringBootEmployee.services;

import java.util.List;

import com.hcl.SpringBootEmployee.beans.Employee;
import com.hcl.SpringBootEmployee.util.UserDefinedException;

public interface IEmployeeDetails 
{

      Employee addDetails(Employee e) throws UserDefinedException;
	  List<Employee> display();
	  Employee update(Employee e) throws UserDefinedException;
	  boolean delete(int id) throws UserDefinedException;
	  Employee search(int id) throws UserDefinedException;


	
}
