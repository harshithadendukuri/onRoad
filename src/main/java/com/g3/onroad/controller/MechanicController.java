package com.g3.onroad.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.g3.onroad.entity.Request;
import com.g3.onroad.entity.User;
import com.g3.onroad.service.MechanicService;
import com.g3.onroad.service.RequestService;

@RestController
@RequestMapping("/mechanic")
@CrossOrigin("http://localhost:4200")
public class MechanicController {
	@Autowired
	private MechanicService service;
	
	@Autowired
	private RequestService requestService;
	
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/viewMechanic")
	List<User> viewMechanic(){
		List<User> li = new ArrayList<User>();
		li=service.viewMechanic();
		return li;
	}

	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/viewRequest")
	List<Request> viewRequest(){
		List<Request> li = new ArrayList<Request>();
		li=requestService.viewRequest();
		return li;
	}
	
}

