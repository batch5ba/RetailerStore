package com.store.ManagerService.model;

public class UserPojo {
	

	
	private int userId;
	private String userName;
	private String userUsername;
	private String userPassword;
	private String userRole;
	
	public UserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPojo(int userId, String userName, String userUsername, String userPassword, String userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserPojo [userId=" + userId + ", userName=" + userName + ", userUsername=" + userUsername
				+ ", userPassword=" + userPassword + ", userRole=" + userRole + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserUsername() {
		return userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	

}



