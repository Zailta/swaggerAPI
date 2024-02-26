package com.swagger.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/swagger")
public class SwaggerController {

	@PostMapping(value = "/policySearch")
	public ResponseEntity<String> policyLookup(){
		return new ResponseEntity<String>("data", HttpStatus.OK);
	}


	@PostMapping(value = "/estartLookUp")
	public ResponseEntity<String> estartLookUp(){
		return new ResponseEntity<String>("data", HttpStatus.OK);
	}
	
	@PostMapping(value = "/submissionLookUp")
	public ResponseEntity<String> submissionLookUp(){
		return new ResponseEntity<String>("data", HttpStatus.OK);
	}
}
