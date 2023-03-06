package com.g3.onroad.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.g3.onroad.dao.RequestDao;
import com.g3.onroad.entity.Request;

@Component
@Transactional
public class RequestServiceImpl implements RequestService {

	@Autowired
	private RequestDao rDao;
	@Override
	public List<Request> viewRequest() {
		List<Request> list=new ArrayList<>();
		list=rDao.findAll();
		return list;
	}
	@Override
	public boolean create(Request sendRequest) {
		rDao.save(sendRequest);
		return true;
	}

}
