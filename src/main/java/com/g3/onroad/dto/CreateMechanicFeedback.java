package com.g3.onroad.dto;

public class CreateMechanicFeedback {
private String feedback;
public int mechId;
public String location;
public CreateMechanicFeedback() {
	super();
	
}
public CreateMechanicFeedback(String feedback, int mechId, String location) {
	super();
	this.feedback = feedback;
	this.mechId = mechId;
	this.location = location;
}
@Override
public String toString() {
	return "CreateMechanicFeedback [feedback=" + feedback + ", mechId=" + mechId + ", location=" + location + "]";
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
public int getMechId() {
	return mechId;
}
public void setMechId(int mechId) {
	this.mechId = mechId;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}



	
}
