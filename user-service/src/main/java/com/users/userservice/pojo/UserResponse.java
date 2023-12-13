package com.users.userservice.pojo;

import java.util.List;

public class UserResponse {
	
	private List<Users> users;
	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public UserResponse() {
		// TODO Auto-generated constructor stub
	}

	public UserResponse(List<Users> users) {
		super();
		this.users = users;
	}
	
	
}
