package com.g3.onroad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.Entity;

@Entity
@Table(name="user_road")
public class User {
	

	@Id
	@GeneratedValue
	private int userId;
	private String name;
	private String userType;
	private int locationId;
	private long mobile;
	private String password;
	private String email;
	private String address;
	private boolean isActive;
	
	public User() {
		super();
		
	}

	public User(int userId, String name, String userType, int locationId, long mobile, String password, String email,
			String address, boolean isActive) {
		super();
		this.userId = userId;
		this.name = name;
		this.userType = userType;
		this.locationId = locationId;
		this.mobile = mobile;
		this.password = password;
		this.email = email;
		this.address = address;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", userType=" + userType + ", locationId=" + locationId
				+ ", mobile=" + mobile + ", password=" + password + ", email=" + email + ", address=" + address
				+ ", isActive=" + isActive + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	
}