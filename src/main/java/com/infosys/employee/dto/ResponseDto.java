package com.infosys.employee.dto;

public class ResponseDto {
	
	String message;
	String status;
	
	public ResponseDto(String status, String message) {
		this.message=message;
		this.status=status;
	}
	
	

	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "{ \"message\": \"" + message + "\", \"status\":" +status + "\"}";
	}
	
	

}
