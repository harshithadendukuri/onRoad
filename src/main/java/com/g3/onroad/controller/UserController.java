package com.g3.onroad.controller;



import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.g3.onroad.dto.CreateSendRequest;

import com.g3.onroad.entity.Request;
import com.g3.onroad.entity.User;
import com.g3.onroad.exception.AuthorisedUserRoleNotFoundException;
import com.g3.onroad.service.RequestService;
import com.g3.onroad.service.UserService;
import com.g3.onroad.util.UserUtil;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserUtil userUtil;
	@Autowired
	private RequestService requestService;
	private String Userid;

	@PostMapping("/saveuser")
	public boolean createUser(@RequestBody User user) throws AuthorisedUserRoleNotFoundException {
		userService.create(user);
		return true;
	}

//	@ResponseStatus(HttpStatus.ACCEPTED)
//	@PostMapping("/login")
//	public String login(@RequestBody User userid, HttpServletRequest request) {
//		HttpSession session = request.getSession();
//		System.out.println(session);
//		String role = userService.login(userid);
//		session.setAttribute("userid", user.getUserId());
//		session.setAttribute("role", user.getUserType());
//	
//		return Userid;
//	}
	
	@GetMapping("/login")
	public ResponseEntity<?> login(@RequestParam long mobile,@RequestParam String password) {
		ResponseEntity<?> entity = null;
		User dbuser = userService.findByMobile(mobile);
		if(dbuser == null) {
			entity = new ResponseEntity<String>("user not found", HttpStatus.BAD_REQUEST);
		}else if(!dbuser.getPassword().equals(password));
		entity = new ResponseEntity<String>("password invaild", HttpStatus.BAD_REQUEST);

			entity = new ResponseEntity<User>(dbuser, HttpStatus.OK);
		
		return entity;
		
		
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/sendRequest")
	public String sendRequest(HttpServletRequest request,@RequestBody CreateSendRequest requestData) throws MismatchedInputException {
		boolean requ=true;
		Request sendRequest=new Request(requestData.getRequestId(),requestData.getIssue(),requestData.getLocationId(),requestData.getUserId(),requestData.getUserType(),requestData.getResolvesBy(),requestData.getIsActive());
		if(requ=requestService.create(sendRequest)) {
			return "Request send successfully";
		}
		return "Request not send";
	}
	
	
}
