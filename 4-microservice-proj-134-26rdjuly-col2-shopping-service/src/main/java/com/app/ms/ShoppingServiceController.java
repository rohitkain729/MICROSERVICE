package com.app.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.clientcomp.BillingServiceClientComp;

@RestController
@RequestMapping("/shopping-api")
public class ShoppingServiceController {

	@Autowired
	private BillingServiceClientComp client;

	@GetMapping("/purchase")
	public ResponseEntity<String> shopping() {

		System.out.println("client comp class obj ::" + client.getClass());
		// generate bill amount
		double amt = new Random().nextInt(400000);

		// invole provide MS
		String resultMsg = client.invokeDoPayment();

		// return the final msg

		String finalMessage = "Shopping is done having amount::" + amt + "........" + resultMsg;

		return new ResponseEntity<String>(finalMessage, HttpStatus.OK);
	}
	
	
	
	
	@GetMapping("/purchase/{cardNo}")
	public ResponseEntity<String> shopping(@PathVariable("cardNo")long cardNo) {

		System.out.println("client comp class obj ::" + client.getClass());
		// generate bill amount
		double amt = new Random().nextInt(400000);

		// invole provide MS
		String resultMsg = client.invokeDoPayment1(cardNo);

		// return the final msg

		String finalMessage = "Shopping is done having amount::" + amt + "........" + resultMsg;

		return new ResponseEntity<String>(finalMessage, HttpStatus.OK);
	}

}
