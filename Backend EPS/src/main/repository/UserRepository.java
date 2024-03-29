package com.employee_payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee_payroll.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
