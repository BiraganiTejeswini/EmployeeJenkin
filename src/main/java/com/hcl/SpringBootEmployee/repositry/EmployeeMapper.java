package com.hcl.SpringBootEmployee.repositry;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.SpringBootEmployee.beans.Employee;



public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e=new Employee();
		e.setId(rs.getInt(1));
		e.setEname(rs.getString(2));
		e.setDesignation(rs.getString(3));
		e.setLoc(rs.getString(4));
		return e;
	}

}
