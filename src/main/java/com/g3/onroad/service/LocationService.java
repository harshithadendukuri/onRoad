package com.g3.onroad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.g3.onroad.entity.Location;
@Service
public interface LocationService {

	int saveLocation(Location location);

	List<Location> viewLocation();

	

}
