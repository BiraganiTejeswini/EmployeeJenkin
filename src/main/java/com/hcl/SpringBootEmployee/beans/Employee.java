package com.hcl.SpringBootEmployee.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import lombok.*;

@Data
@Component
@NoArgsConstructor
@Scope
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private  int id;
	@Column(name="ename")
	private String ename;
	@Column(name="designation")
	private String designation;
	@Column(name="loc")
	private String loc;

}
