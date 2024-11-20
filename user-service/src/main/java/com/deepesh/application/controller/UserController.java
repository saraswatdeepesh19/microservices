package com.deepesh.application.controller;

import com.deepesh.application.entity.UserDetails;
import com.deepesh.application.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping
	public ResponseEntity<UserDetails> saveUserDetails(@Valid @RequestBody UserDetails userDetails) {

		UserDetails saveUserDetails = userService.saveUserDetails(userDetails);
		return new ResponseEntity<>(saveUserDetails, HttpStatus.OK);
	}

}
