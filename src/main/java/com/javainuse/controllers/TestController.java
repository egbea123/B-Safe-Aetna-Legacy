package com.javainuse.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.javainuse.model.Employee;

@RestController
@EnableWebMvc
public class TestController {
//@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, 
//	method = RequestMethod.GET
//			value = "/schema")

	@RequestMapping(value = "/employee", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("Joan Myer");
		emp.setDesignation("manager");
		emp.setEmpId("1003");
		emp.setSalary(30000);

		return emp;
	}

}
