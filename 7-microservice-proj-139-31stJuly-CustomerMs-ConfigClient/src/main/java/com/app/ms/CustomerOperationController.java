package com.app.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationController {

	@Value("${dbuser}")
	private String username;
	@Value("${dbpwd}")
	private String userpassword;

	@GetMapping("/customer-data")
	public String showCustomerData() {
		return "CUSTOMER MS----::::username::" + username + "::password::" + userpassword;
	}

}
