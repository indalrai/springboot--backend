package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;

	@Column(name = "first_name", nullable = false)
	public String firstName;

	@Column(name = "last_name")
	public String lastName;

	@Column(name = "email")
	public String email;

	
}
