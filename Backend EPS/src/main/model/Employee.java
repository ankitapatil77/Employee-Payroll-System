package com.employee_payroll.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "emp_name")
	private String emp_name;

	@Column(name = "date_of_joining")
	private Date date_of_joining;

	@Column(name = "gender")
	private String gender;

	@Column(name = "age")
	private int age;

	@Column(name = "designation")
	private String designation;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	public Employee() {
		
	}

	public Employee(String emp_name, Date date_of_joining, String gender, int age, String designation,
			String email, String password) {
		super();
		this.emp_name = emp_name;
		this.date_of_joining = date_of_joining;
		this.gender = gender;
		this.age = age;
		this.designation = designation;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Date getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}