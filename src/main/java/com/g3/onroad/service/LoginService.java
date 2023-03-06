package com.g3.onroad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3.onroad.dao.UserDao;
import com.g3.onroad.entity.User;

@Service
public interface LoginService {
	

	User findByEmail(String email);

	User findByUserId(int userId);
}
