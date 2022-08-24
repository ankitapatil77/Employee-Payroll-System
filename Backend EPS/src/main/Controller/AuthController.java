package com.employee_payroll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee_payroll.model.User;
import com.employee_payroll.service.AuthService;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

	@Autowired
	private AuthService authService;
    
	@PostMapping("/register")
	public User Register(@RequestBody User user) {
		return authService.register(user);

	}
	
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return authService.login(user);

	}
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return authService.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") String id) {

		authService.deleteUser(id);

		return new ResponseEntity<String>("Attendance deleted successfully!.", HttpStatus.OK);
	}

}
