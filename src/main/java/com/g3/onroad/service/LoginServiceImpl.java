package com.g3.onroad.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3.onroad.dao.UserDao;
import com.g3.onroad.entity.User;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserDao uDao;
	
	@Override
	public User findByEmail(String email) {
		
		return uDao.findByEmail(email);
		
	}

	@Override
	public User findByUserId(int userId) {
		// TODO Auto-generated method stub
		return uDao.findByUserId(userId);
	}}

	
