package com.app.ms;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ms.model.Vendor;

@RestController
@RequestMapping("/vendor")
public class VendorServiceController {

	@GetMapping("/all")
	public ResponseEntity<List<Vendor>> getAllProduct() {
		List<Vendor> list = List.of(new Vendor(11, "rohit"), new Vendor(12, "abhishek"), new Vendor(13, "ashok"));
		return new ResponseEntity<List<Vendor>>(list, HttpStatus.OK);
	}
}
