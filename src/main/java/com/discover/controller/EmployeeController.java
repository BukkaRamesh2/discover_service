package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping ("api/employee")
@Tag(name = "Employee API", description = "Employee Operations")
@SecurityRequirement(name = "bearerAuth") // This applies JWT auth to all endpoints in this controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping ("/addEmployee")
	@Operation(summary = "Add Customer")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.addEmployee(employee);
		return new ResponseEntity<>(emp, HttpStatus.CREATED);
	}
	
	@GetMapping ("/getEmployee/{employeeID}")
	@Operation(summary = "Get Employee using ID")
	public ResponseEntity<Employee> getEmployee(@PathVariable("employeeID") Long ID) {
		Employee emp = employeeService.getEmployee(ID);
		return ResponseEntity.ok(emp);
	}
	
	@GetMapping ("/getAllEmployee")
	@Operation(summary = "Get all Employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
	@PutMapping ("/updateEmployee")
	@Operation(summary = "Update Employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.updateEmployee(employee);
		return ResponseEntity.ok(emp);
	}
	
	@DeleteMapping ("/deleteEmployee/{employeeID}")
	@Operation(summary = "Delete Employee using ID")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("employeeID") Long ID) {
		 employeeService.deleteEmployee(ID);
		 return ResponseEntity.noContent().build();
	}

}
