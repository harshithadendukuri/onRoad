package com.g3.onroad.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.g3.onroad.entity.User;
import com.g3.onroad.service.MechanicService;
import com.g3.onroad.service.UserService;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:4200")
public class AdminController {
	@Autowired
	private MechanicService mechanicService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/viewMechanic")
	List<User> viewMechanic(){
		List<User> li = new ArrayList<User>();
		li=mechanicService.viewMechanic();
		return li;
	}
	
	@GetMapping("/viewUser")
	List<User> viewUser(){
		List<User> li = new ArrayList<User>();
		li=userService.viewUser();
		return li;
	}
}
