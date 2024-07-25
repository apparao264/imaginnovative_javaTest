package com.imaginnovate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.repository.EmployeeRepository;


import com.imaginnovate.model.EmployeeDTO;
import com.imaginnavative.entity.Employee;

@Service
public class EmployeeService {

	    @Autowired
	    private EmployeeRepository employeeRepository;

	    public EmployeeDTO saveEmployee(@Valid EmployeeDTO employeeDTO) {
	        Employee employee = convertToEntity(employeeDTO);
	        return employeeRepository.save(employee);
	    }
	
	    private Employee convertToEntity(EmployeeDTO employeeDTO) {
	        Employee employee = new Employee();
	        employee.setFirstName(employeeDTO.getFirstName());
	        employee.setLastName(employeeDTO.getLastName());
	        employee.setEmail(employeeDTO.getEmail());
	        employee.setPhoneNumbers(employeeDTO.getPhoneNumbers());
	        employee.setDateOfJoining(employeeDTO.getDateOfJoining());
	        employee.setSalary(employeeDTO.getSalary());
	        return employee;
	    }

}
