package com.discover.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discover.entity.Employee;
import com.discover.repository.EmployeeRepository;


public interface EmployeeService{
	public Employee addEmployee(Employee employee);
	public Employee getEmployee(Long ID);
	public List<Employee> getAllEmployee();
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Long ID);
}
