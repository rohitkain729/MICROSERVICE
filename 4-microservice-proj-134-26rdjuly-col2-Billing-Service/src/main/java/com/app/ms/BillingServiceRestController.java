package com.app.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingServiceRestController {

	@Value("${server.port}")
	private int port;

	@Value("${eureka.instance.instance-id}")
	private String instance_id;

	@GetMapping("/payment")
	public ResponseEntity<String> doPayment() {

		return new ResponseEntity<String>("payment can be done using Cards:::" + instance_id + "----" + port,
				HttpStatus.OK);

	}

	@GetMapping("/payment/{cardNo}")
	public ResponseEntity<String> doPayment1(@PathVariable("cardNo") long cardNo) {

		return new ResponseEntity<String>("payment can be done using Cards:::" + cardNo +"---::"+ instance_id + "----" + port,
				HttpStatus.OK);

	}

}
