package com.g3.onroad.dto;

public class UserFeedbackDetails {
	private String name;
	private String feedback;
	private String userType;
	private int fid;
	public UserFeedbackDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserFeedbackDetails(String name, String feedback, String userType, int fid) {
		super();
		this.name = name;
		this.feedback = feedback;
		this.userType = userType;
		this.fid = fid;
	}
	@Override
	public String toString() {
		return "UserFeedbackDetails [name=" + name + ", feedback=" + feedback + ", userType=" + userType + ", fid="
				+ fid + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	
}
