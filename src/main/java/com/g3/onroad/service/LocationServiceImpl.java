package com.g3.onroad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.g3.onroad.dao.LocationDao;

import com.g3.onroad.entity.Location;
@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationDao lDao;

	@Override
	public int saveLocation(Location location) {
		Location locationId = lDao.save(location);
		return locationId.getLocationId();
	}

	@Override
	public List<Location> viewLocation() {
		List<Location> list = new ArrayList<Location>();
		list=lDao.findAll();
		return list;
	}
	}
