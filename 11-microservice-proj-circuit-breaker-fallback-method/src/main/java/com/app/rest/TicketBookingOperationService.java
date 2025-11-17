package com.app.rest;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/ticket")
public class TicketBookingOperationService {

	// business method
	@GetMapping("/booking")
	@HystrixCommand(fallbackMethod = "dummyBookTickets")
	public ResponseEntity<String> bookingTicket() {
		System.out.println("TicketBookingOperationService.bookingTicket()");

		if (new Random().nextInt(8) < 5)
			throw new RuntimeException("problem in business logic of ticket booking");
		return new ResponseEntity<String>("ticket booked successfully", HttpStatus.OK);

	}

	// fallback method

	public ResponseEntity<String> dummyBookTickets() {
		System.out.println("TicketBookingOperationService.dummyBookTickets()");
		return new ResponseEntity<String>("Problem in Ticket Booking.....inconvenience is regretted", HttpStatus.OK);

	}
	

}
