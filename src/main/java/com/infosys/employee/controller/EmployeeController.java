package com.infosys.employee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.employee.dto.EmployeeDto;
import com.infosys.employee.dto.ResponseDto;
import com.infosys.employee.exception.EmployeeException;
import com.infosys.employee.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping(value="/insert", consumes="application/json", produces="application/json")
	@ResponseBody
	public ResponseDto insert(@Valid @RequestBody EmployeeDto e)  {
		ResponseDto resDto=empService.insert(e);
		return resDto;
		
	}
	
	@PostMapping(value="/update", consumes="application/json", produces="application/json")
	@ResponseBody
	public ResponseDto update(@Valid @RequestBody EmployeeDto e)  {
		return empService.update(e);
	}
	
	@PostMapping(value="/delete/{id}", produces="application/json" )
	@ResponseBody
	public ResponseDto delete(@PathVariable Integer id)  {
		return empService.delete(id);
	}
	
	@GetMapping(value="/get/{id}", produces="application/json" )
	@ResponseBody
	public Object fetchEmployee(@PathVariable Integer id) throws EmployeeException  {
		
		return	empService.fetchEmployee(id);
	}

}
