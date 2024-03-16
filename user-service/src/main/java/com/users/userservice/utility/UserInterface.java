package com.users.userservice.utility;

import org.springframework.http.ResponseEntity;

import com.users.userservice.pojo.request.UserRequestModel;
import com.users.userservice.pojo.response.UserResponseModel;

import jakarta.validation.Valid;

public  interface UserInterface {

	public  ResponseEntity<UserResponseModel> submitDetails(@Valid UserRequestModel userRequestModel);
	public  ResponseEntity<UserResponseModel> updateDetails(UserRequestModel userRequestModel);
	public  ResponseEntity<UserResponseModel> getList();
	public  ResponseEntity<UserResponseModel> getDetails(String user_id);
	public  ResponseEntity<UserResponseModel> deleteDetails(String user_id);

}
