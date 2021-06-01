package com.hcl.SpringBootEmployee.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hcl.SpringBootEmployee.beans.Employee;
import com.hcl.SpringBootEmployee.services.EmployeeDetailsImpl;
import com.hcl.SpringBootEmployee.util.UserDefinedException;



@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDetailsImpl ed;
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		List<Employee> ls=new ArrayList<Employee>();
		
	 ls=ed.display();
		return ls;
	}
	//adding employee
	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e) throws UserDefinedException{
	
			return new ResponseEntity<>(ed.addDetails(e),HttpStatus.OK);
	}
	@PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmp(@PathVariable int id,@RequestBody Employee e) throws UserDefinedException {
		
     	  return new ResponseEntity<Employee>(ed.update(e),HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delEmp(@PathVariable int id) throws UserDefinedException {
      
       return new ResponseEntity<Boolean>(ed.delete(id),HttpStatus.ACCEPTED);
    }
	@GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee>getEmpOnId(@PathVariable int id) throws UserDefinedException {
      
       return new ResponseEntity<Employee>(ed.search(id),HttpStatus.OK);
          
    }  
}
