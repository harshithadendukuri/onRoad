package com.g3.onroad.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.g3.onroad.dao.UserDao;
import com.g3.onroad.entity.User;

@Component
@Transactional
public class UserServiceImpl implements UserService {
@Autowired
private UserDao uDao;

@Override
public boolean create(User feedback) {
	uDao.save(feedback);
	return true;
}

@Override
public User findByEmail(String email) {
	
return uDao.findByEmail(email);
	
}

@Override
public List<User> viewUser() {
	List<User> list= new ArrayList<>();
	list=uDao.findAll();
	List<User> list1=list.stream().filter(user->user.getUserType().equals("user")).collect(Collectors.toList());
	return list1;
}

@Override
public String login(User user) {
	String role ="";
	Optional<User> op = uDao.findById(user.getUserId());
	if(!op.isPresent()) {
		System.out.println("No user found for userid="+user.getUserId());
	}
	User use =op.get();
	if(!user.getPassword().equals(use.getPassword())) {
		System.out.println("Authentication failed for userid="+user.getUserId());
	}
	role =use.getUserType();
	return role;
}

@Override
public User findByMobile(long mobile) {
	return uDao.findByMobile(mobile);
	
}
}
