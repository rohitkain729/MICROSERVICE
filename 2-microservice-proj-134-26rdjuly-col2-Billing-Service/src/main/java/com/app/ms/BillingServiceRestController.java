package com.app.ms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingServiceRestController {

	@GetMapping("/payment")
	public ResponseEntity<String> doPayment() {
		return new ResponseEntity<String>("payment can be done using Cards", HttpStatus.OK);

	}

}
