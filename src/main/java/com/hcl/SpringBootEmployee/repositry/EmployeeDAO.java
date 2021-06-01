package com.hcl.SpringBootEmployee.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.SpringBootEmployee.beans.Employee;


@Repository
public interface EmployeeDAO extends JpaRepository<Employee ,Integer>{
	
}

