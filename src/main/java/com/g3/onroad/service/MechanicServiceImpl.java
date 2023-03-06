package com.g3.onroad.service;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.g3.onroad.dao.UserDao;

import com.g3.onroad.entity.User;
@Component
@Transactional
public class MechanicServiceImpl implements MechanicService {

@Autowired
private UserDao uDao;



	@Override
	public List<User> viewMechanic() {
		List<User> list= new ArrayList<>();
		list=uDao.findAll();
		List<User> list1=list.stream().filter(user->user.getUserType().equals("mechanic")).collect(Collectors.toList());
		return list1;
	}

	@Override
	public List<User> viewUser() {
     List<User> list=new ArrayList<>();
     list=uDao.findAll();
		return list;
	}

	

	

}
