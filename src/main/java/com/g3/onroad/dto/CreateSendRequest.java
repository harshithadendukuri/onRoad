package com.g3.onroad.dto;

public class CreateSendRequest {

	private int requestId;
	private String issue;
	private int locationId;
	private int userId;
	private String userType;
	private String resolvesBy;
	private int isActive;
	public CreateSendRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateSendRequest(int requestId, String issue, int locationId, int userId, String userType,
			String resolvesBy, int isActive) {
		super();
		this.requestId = requestId;
		this.issue = issue;
		this.locationId = locationId;
		this.userId = userId;
		this.userType = userType;
		this.resolvesBy = resolvesBy;
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "CreateSendRequest [requestId=" + requestId + ", issue=" + issue + ", locationId=" + locationId
				+ ", userId=" + userId + ", userType=" + userType + ", resolvesBy=" + resolvesBy + ", isActive="
				+ isActive + "]";
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
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
	public String getResolvesBy() {
		return resolvesBy;
	}
	public void setResolvesBy(String resolvesBy) {
		this.resolvesBy = resolvesBy;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	
}
