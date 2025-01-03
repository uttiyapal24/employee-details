package com.infosys.employee.exception;

public class EmployeeException extends Exception {

	private String status;
	EmployeeException(String message){
		super( message);
		
	}

	public EmployeeException(String failed, String message) {
		// TODO Auto-generated constructor stub
		super( message);
		status=failed;
	}
	
	public String getStatus() {
		return status;
	}
	
}
