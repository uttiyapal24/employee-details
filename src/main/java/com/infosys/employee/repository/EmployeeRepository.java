package com.infosys.employee.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infosys.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

		//public Employee findEmployeeById(@Param("empId") Integer id);
}
