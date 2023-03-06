package com.g3.onroad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.g3.onroad.entity.Request;

@Service
public interface RequestService {

	List<Request> viewRequest();

	boolean create(Request sendRequest);


}
