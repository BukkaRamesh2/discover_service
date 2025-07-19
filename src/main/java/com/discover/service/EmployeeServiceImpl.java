package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discover.entity.Employee;
import com.discover.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	@Autowired
	EmployeeRepository employeerepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeerepository.save(employee);
	}
	
	@Override
	public Employee getEmployee(Long ID) {
		return employeerepository.getById(ID);
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
		return employeerepository.save(employee);
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeerepository.findAll();
	}
	
	@Override
	public void deleteEmployee(Long ID) {
		employeerepository.deleteById(ID);;
	}
}
