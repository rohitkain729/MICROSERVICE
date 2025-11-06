package com.app.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-api")
public class EmployeeOperationController {

	@Value("${dbuser}")
	private String username;
	@Value("${dbpwd}")
	private String userpassword;

	@GetMapping("/emp-data")
	public String showData() {
		return "EMPLOYEE MS----::::username::" + username + "::password::" + userpassword;
	}

}
