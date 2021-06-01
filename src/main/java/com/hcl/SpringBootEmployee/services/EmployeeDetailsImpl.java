package com.hcl.SpringBootEmployee.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.SpringBootEmployee.beans.Employee;
import com.hcl.SpringBootEmployee.repositry.EmployeeDAO;
import com.hcl.SpringBootEmployee.util.UserDefinedException;

@Service
public class EmployeeDetailsImpl implements IEmployeeDetails {
//Employee e=new Employee();
@Autowired
private EmployeeDAO ed;
	public Employee addDetails(Employee e) throws UserDefinedException {
		if(!ed.findById(e.getId()).isPresent()) {
		return  (Employee) ed.save(e);
	}
		else {
			throw new UserDefinedException(" Id exists in table......");
		}
	}

	
	public List<Employee> display() {
		return ed.findAll();
	}

	
	public Employee update(Employee e) throws UserDefinedException {
		if(ed.findById(e.getId()).isPresent()) {
		return    ed.saveAndFlush(e);

	}
		else 
		{
			throw new UserDefinedException(" Employee Id not exists in table to update.Recheck the id......");

		}
	}


	public boolean delete(int id) throws UserDefinedException {
		if(ed.findById(id).isPresent()) {
		 ed.deleteById(id);
		 return true;
		}
		else 
		{
			throw new UserDefinedException(" Employee Id not exists in table to delete.Recheck the id......");

		}
	}
	
	public Employee search(int id) throws UserDefinedException {
		if(ed.findById(id).isPresent()) {
			return (Employee) ed.findById(id).get();
		}
		else 
		{
			throw new UserDefinedException(" Employee Id not exists in table.Recheck the id......");

		}

	}

}
