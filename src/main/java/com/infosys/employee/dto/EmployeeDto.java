package com.infosys.employee.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
public class EmployeeDto {

	Integer empId;
	
	@NotNull
	@NotEmpty
	String empName;
	
	@NotNull
	@NotEmpty
	String empEmail;
	@NotNull
	@NotEmpty
	String empUnit;
	
	String empLocation;
	
	String empPhnum;
	
	String empDoj;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpUnit() {
		return empUnit;
	}
	public void setEmpUnit(String empUnit) {
		this.empUnit = empUnit;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public String getEmpPhnum() {
		return empPhnum;
	}
	public void setEmpPhnum(String empPhnum) {
		this.empPhnum = empPhnum;
	}
	public String getEmpDoj() {
		return empDoj;
	}
	public void setEmpDoj(String empDoj) {
		this.empDoj = empDoj;
	}
	@Override
	public String toString() {
		return "EmployeeDto [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empUnit="
				+ empUnit + ", empLocation=" + empLocation + ", empPhnum=" + empPhnum + ", empDoj=" + empDoj + "]";
	}
	
	
	
}
