package com.app.ms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search-api")
public class SearchServiceOperationController {

	@GetMapping("/welcome")
	public ResponseEntity<String> showHome() {
		return new ResponseEntity<String>("welcome to search service Ms", HttpStatus.OK);
	}

}
