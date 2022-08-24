package com.employee_payroll.service;

import java.util.List;

import com.employee_payroll.model.AdminAttendance;

public interface AdminAttendanceService {
	AdminAttendance saveAdminAttendance(AdminAttendance adminAttendance);

	List<AdminAttendance> getAllAttendance();

	AdminAttendance getAttendanceById(long id);

	AdminAttendance updateAttendance(AdminAttendance adminAttendance, long id);

	void deleteAttendance(long id);
}