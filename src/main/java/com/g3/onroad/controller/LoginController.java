package com.g3.onroad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.g3.onroad.entity.User;
import com.g3.onroad.service.LoginService;

@RestController
@RequestMapping("/login")
@CrossOrigin("http://localhost:4200")
public class LoginController {

	@Autowired
	private LoginService loginService;

	
	@GetMapping("/loginDetails")
	public ResponseEntity<?> login(@RequestParam int userId) {
		ResponseEntity<?> entity = null;
		User dbuser = loginService.findByUserId(userId);

			entity = new ResponseEntity<User>(dbuser, HttpStatus.OK);
		
		return entity;
		
		
	}

}
