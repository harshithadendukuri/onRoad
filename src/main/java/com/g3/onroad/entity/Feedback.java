package com.g3.onroad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="feedback")
public class Feedback {
	@Id
	@GeneratedValue
	@Column(name="fid")
    private int feedbackId;
	@Column(name="feedback")
	private String feedback;
	@Column(name="uid")
	private int userId;
	@Column(name="usertype")
	private String userType;
	@Column(name="location")
	private String location;
	public Feedback() {
		super();
		
	}
	public Feedback(int feedbackId, String feedback, int userId, String userType, String location) {
		super();
		this.feedbackId = feedbackId;
		this.feedback = feedback;
		this.userId = userId;
		this.userType = userType;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", feedback=" + feedback + ", userId=" + userId + ", userType="
				+ userType + ", location=" + location + "]";
	}
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
