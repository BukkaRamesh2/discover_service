package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Employee;
import com.discover.service.EmployeeService;

import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping ("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@PostMapping ("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeservice.addEmployee(employee);
	}
	
	@GetMapping ("/getEmployee/{employeeID}")
	public Employee getEmployee(@PathVariable("employeeID") Long ID) {
		return employeeservice.getEmployee(ID);
	}
	
	@GetMapping ("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return employeeservice.getAllEmployee();
	}
	
	@PutMapping ("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeservice.updateEmployee(employee);
	}
	
	@DeleteMapping ("/deleteEmployee/{employeeID}")
	public void deleteEmployee(@PathVariable("employeeID") Long ID) {
		 employeeservice.deleteEmployee(ID);
	}

}
