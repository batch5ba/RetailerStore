package com.store.loginservice.loginservice.model;

public class UserPojo {

	
	
	private int user_id;
	private String username;
	private String user_username;
	private String password;
	private String user_role;
	
	public UserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPojo(int user_id, String username, String user_username, String password, String user_role) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.user_username = user_username;
		this.password = password;
		this.user_role = user_role;
	}

	@Override
	public String toString() {
		return "UserPojo [user_id=" + user_id + ", username=" + username + ", user_username=" + user_username
				+ ", password=" + password + ", user_role=" + user_role + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUser_username() {
		return user_username;
	}

	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	

	
	
	
	

}
