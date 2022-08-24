package com.employee_payroll.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_attendance")
public class AdminAttendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "emp_name")
	private String emp_name;

	@Column(name = "email")
	private String email;

	@Column(name = "date")
	private String date;

	@Column(name = "status")
	private String status;

	public AdminAttendance() {

	}

	public AdminAttendance(long id, String emp_name, String email, String date, String status) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.email = email;
		this.date = date;
		this.status = status;
	}

	public long getEmp_id() {
		return id;
	}

	public void setEmp_id(long id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
