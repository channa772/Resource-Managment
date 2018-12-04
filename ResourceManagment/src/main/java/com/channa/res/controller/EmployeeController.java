package com.channa.res.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.channa.res.bean.EmployeeBean;
import com.channa.res.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/res")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl  employeeServiceImpl;
	
	/*@PostMapping(value="/emp/add", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.TEXT_HTML_VALUE)*/
	@RequestMapping(value="/emp/add",
	method=RequestMethod.POST,
	consumes=MediaType.APPLICATION_JSON_VALUE,
	produces=MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeBean employeeBean) {
		
		int id = employeeServiceImpl.addEmployee(employeeBean);
		
		return new ResponseEntity<String>("Employye is created with id "+ id , HttpStatus.CREATED);
	}
}
