package com.g3.onroad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.g3.onroad.entity.User;

@Service
public interface UserService {

	boolean create(User user);
	
	User findByEmail(String email);
	
	List<User> viewUser();

	String login(User user);

	User findByMobile(long mobile);
	

}
