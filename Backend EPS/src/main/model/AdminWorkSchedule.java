package com.employee_payroll.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeWork_schedule")
public class AdminWorkSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "emp_name")
	private String emp_name;
	
	@Column(name = "work_date")
	private Date workdate;

	@Column(name = "work_time")
	private String worktime;

	@Column(name = "work_shift")
	private String workshift;

	@Column(name = "work_status")
	private String workstatus;

	public AdminWorkSchedule() {

	}

	public AdminWorkSchedule(long id,String emp_name, Date workdate, String worktime, String workshift, String workstatus) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.workdate = workdate;
		this.workshift = workshift;
		this.workstatus = workstatus;
		this.worktime = worktime;
	}

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}
	
	public String getemp_name() {
		return emp_name;
	}

	public void setemp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Date getworkdate() {
		return workdate;
	}

	public void setworkdate(Date workdate) {
		this.workdate = workdate;
	}

	public String getworkshift() {
		return workshift;
	}

	public void setworkshift(String workshift) {
		this.workshift = workshift;
	}

	public String getworkstatus() {
		return workstatus;
	}

	public void setworkstatus(String workstatus) {
		this.workstatus = workstatus;
	}

	public String getworktime() {
		return worktime;
	}

	public void setworktime(String worktime) {
		this.worktime = worktime;
	}

}