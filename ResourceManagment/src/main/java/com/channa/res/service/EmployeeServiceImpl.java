package com.channa.res.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.channa.res.bean.EmployeeBean;
import com.channa.res.dao.EmployeeDao;
import com.channa.res.entity.EmployeeEntity;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public int addEmployee(EmployeeBean employeeBean) {
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeBean, employeeEntity);
		EmployeeEntity emp =(EmployeeEntity) employeeDao.save(employeeEntity);
		int empId = emp.getEmployeeId();
		
		return empId;
	}
	
}
