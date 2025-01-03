package com.infosys.employee.services;

import java.util.ArrayList;
import java.util.Optional;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.employee.EmployeeConstant;
import com.infosys.employee.dto.EmployeeDto;
import com.infosys.employee.dto.ResponseDto;
import com.infosys.employee.entity.Employee;
import com.infosys.employee.exception.EmployeeException;
import com.infosys.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	Logger log = LogManager.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public ResponseDto insert(EmployeeDto e) {
		try {
			
			Employee em=new Employee();
			em.setDto(e);
			empRepo.save(em);
			return new ResponseDto(EmployeeConstant.SUCCESS,"Employee Details Saved. ");
		}
		catch(Exception ex) {
			log.error("Error : ",ex);
			return new ResponseDto(EmployeeConstant.FAILED,"Failed to save employee details!");
		}
	}

	@Override
	public ResponseDto update(EmployeeDto e) {
		try {
			Employee em=new Employee();
			em.setDto(e);
			empRepo.save(em);
			return new ResponseDto(EmployeeConstant.SUCCESS,"Employee Details Updated. ");
		}
		catch(Exception ex) {
			log.error("Error : ",ex);
			return new ResponseDto(EmployeeConstant.FAILED,"Failed to update employee details! As Give Employee Id not found!");
		}
	}

	@Override
	public ResponseDto delete(Integer id) {
		try{
			if (empRepo.existsById(id))
			{
				empRepo.deleteById(id);
				return new ResponseDto(EmployeeConstant.SUCCESS,"Employee:"+id+" is deleted successfully! ");
			}else{
				return new ResponseDto(EmployeeConstant.FAILED,"Employee:"+id+" Failed to delete successfully! ");
			}
		}catch(Exception ex )
		{
			log.error("Error : ",ex);
			return new ResponseDto(EmployeeConstant.FAILED,"Failed to delete employee due to "+ex.getMessage());
		}
		
	}

	@Override
	public EmployeeDto fetchEmployee(Integer id) throws EmployeeException {
		try {
		Employee emp=empRepo.findById(id).get();
		return emp.toDto();
		}catch(Exception ex) {
			if(ex.getMessage().equalsIgnoreCase("No value present")) {
			throw new EmployeeException(EmployeeConstant.FAILED,"The Employee id not found!");
			}else {
				throw new EmployeeException(EmployeeConstant.FAILED,"Failed to fetch employee details due to internal error!");
			}
		}
	}

}
