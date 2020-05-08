package com.store.TaskService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")

public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_username")
	private String userUsername;
	
	@Column(name = "user_password")
	private String userPassword;
	
	@Column(name = "user_role")
	private String userRole;

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserEntity(int userId, String userName, String userUsername, String userPassword, String userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}

	

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userUsername=" + userUsername
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
