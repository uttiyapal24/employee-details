package com.infosys.employee.entity;

import java.io.Serializable;



import com.infosys.employee.dto.EmployeeDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



/**@NamedQueries({
		@NamedQuery( name="Employee.findEmployeeById",
					query="from Employee e where e.empId=:empId")
})*/

@Entity
@Table(name="employee")
public class Employee implements Serializable {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	Integer empId;
	 
	@Column(name="emp_name")
	String empName;
	
	@Column(name="emp_email")
	String empEmail;
	
	@Column(name="emp_unit")
	String empUnit;
	
	@Column(name="emp_location")
	String empLocation;
	
	@Column(name="emp_phnum")
	String empPhnum;
	
	@Column(name="emp_doj")
	String empDoj;
	
	public void setDto(EmployeeDto empDto) {
		this.empId=empDto.getEmpId();
		this.empName= empDto.getEmpName();
		this.empUnit= empDto.getEmpUnit();
		this.empDoj= empDto.getEmpDoj();
		this.empEmail= empDto.getEmpEmail();
		this.empLocation=empDto.getEmpLocation();
		this.empPhnum=empDto.getEmpPhnum();
	}
	
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
	
	public EmployeeDto toDto() {
		EmployeeDto empDto=new EmployeeDto();
		empDto.setEmpId(this.empId);
		empDto.setEmpDoj(this.empDoj);
		empDto.setEmpEmail(this.empEmail);
		empDto.setEmpLocation(this.empLocation);
		empDto.setEmpName(this.empName);
		empDto.setEmpPhnum(this.empPhnum);
		empDto.setEmpUnit(this.empUnit);
		return empDto;
	}
}
