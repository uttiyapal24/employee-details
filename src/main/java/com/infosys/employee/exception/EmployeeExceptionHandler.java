package com.infosys.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.infosys.employee.EmployeeConstant;
import com.infosys.employee.dto.ResponseDto;

@RestControllerAdvice
public class EmployeeExceptionHandler {
	
	@ExceptionHandler(EmployeeException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ResponseDto errorValidationResponse(EmployeeException ex) {
		System.out.println(""+ex.getMessage());
		return new ResponseDto(EmployeeConstant.FAILED,ex.getMessage());
	}


	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseDto errorValidationResponse(MethodArgumentNotValidException ex) {
		
		StringBuilder msg=new StringBuilder();
		ex.getBindingResult().getAllErrors().forEach((error)-> {
			String fieldName=((FieldError)error).getField();
			String message=error.getDefaultMessage();
			msg.append("["+fieldName+":"+message+"]");
		});
		
		return new ResponseDto(EmployeeConstant.FAILED,msg.toString());
	}
}
