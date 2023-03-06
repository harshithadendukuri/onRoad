package com.g3.onroad.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g3.onroad.entity.Location;
import com.g3.onroad.exception.MisMatchInputException;
import com.g3.onroad.service.LocationService;

@RestController
@RequestMapping("/location")
@CrossOrigin("http://localhost:4200")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@PostMapping("/saveLocation")
	public ResponseEntity<?> saveLocation(@RequestBody Location location) throws MisMatchInputException {
		ResponseEntity<?> entity = null;
		int locationId = locationService.saveLocation(location);
		if (locationId !=0) {
			entity = new ResponseEntity<String>("location saved succesfully", HttpStatus.OK);
		} else{
			entity = new ResponseEntity<String>("something went wrong", HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@GetMapping("/viewLocation")
	List<Location> viewLocation(){
		List<Location> li = new ArrayList<Location>();
		li=locationService.viewLocation();
		return li;
	}
}
