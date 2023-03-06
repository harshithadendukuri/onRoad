package com.g3.onroad.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location_road")
public class Location {
	@Id
	@GeneratedValue
	private int locationId;
	private String locationName;
	private int isActive;
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(int locationId, String locationName, int isActive) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", isActive=" + isActive + "]";
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	
	
}
