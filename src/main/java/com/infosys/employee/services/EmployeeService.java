package com.infosys.employee.services;


import com.infosys.employee.dto.EmployeeDto;
import com.infosys.employee.dto.ResponseDto;
import com.infosys.employee.exception.EmployeeException;


public interface EmployeeService {
	
	public ResponseDto insert(EmployeeDto e);
	public ResponseDto update(EmployeeDto e);
	public ResponseDto delete(Integer id);
	public EmployeeDto fetchEmployee (Integer id) throws EmployeeException;

}
