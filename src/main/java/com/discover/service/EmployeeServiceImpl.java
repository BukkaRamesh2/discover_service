package com.discover.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discover.entity.Employee;
import com.discover.exception.EmployeeNotFoundException;
import com.discover.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		if (employee.getEmployeeID() != null) {
			throw new EmployeeNotFoundException("Do not pass ID. It will be auto-generated");
		}
		return employeeRepository.save(employee);
	}
	
	@Override
	public Employee getEmployee(Long ID) {
		return employeeRepository.findById(ID)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee ID " + ID + "not found"));
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
		if (employee.getEmployeeID() == null) {
			throw new EmployeeNotFoundException("You must pass EmployeeID to update the employee");
		}
		Employee emp = employeeRepository.findById(employee.getEmployeeID())
				.orElseThrow(() -> new EmployeeNotFoundException("Employee ID " + employee.getEmployeeID() + "not found"));
		BeanUtils.copyProperties(employee, emp, "employeeID");
		return employeeRepository.save(emp);
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	@Override
	public void deleteEmployee(Long ID) {
		if(!employeeRepository.existsById(ID)) {
			throw new EmployeeNotFoundException("Employee ID " + ID + "not found");
		}
		employeeRepository.deleteById(ID);
	}
}
