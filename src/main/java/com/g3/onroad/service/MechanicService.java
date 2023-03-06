package com.g3.onroad.service;

import java.util.List;


import org.springframework.stereotype.Service;


import com.g3.onroad.entity.User;
@Service
public interface MechanicService {

	

	List<User> viewMechanic();

	List<User> viewUser();

}
