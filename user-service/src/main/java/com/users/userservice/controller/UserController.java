/**
 * 
 */
package com.users.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.userservice.pojo.request.UserRequestModel;
import com.users.userservice.pojo.response.UserResponseModel;
import com.users.userservice.service.UserService;
import com.users.userservice.utility.UserInterface;

import jakarta.validation.Valid;

/**
 * @author  
 *
 */
@RestController
@RequestMapping(UserController.BASE_URL)
@Validated
public class UserController implements UserInterface{
	
	// this is initial routes
	public final static String BASE_URL="api/service/user";
	
	@Autowired
	private UserService userService;

	@Override
	@PostMapping("/submitDetails")
	public ResponseEntity<UserResponseModel> submitDetails(@Valid @RequestBody UserRequestModel userRequestModel) {
		// TODO Auto-generated method stub
		return userService.submitDetails(userRequestModel);
	}

	@Override
	@PutMapping("/updateDetails")
	public ResponseEntity<UserResponseModel> updateDetails(@RequestBody UserRequestModel userRequestModel) {
		// TODO Auto-generated method stub
		return userService.updateDetails(userRequestModel);
	}

	@Override
	@GetMapping("/getList")
	public ResponseEntity<UserResponseModel> getList() {
		// TODO Auto-generated method stub
		return userService.getList();
	}

	@Override
	@GetMapping("/getDetails/{user_id}")
	public ResponseEntity<UserResponseModel> getDetails(@PathVariable String user_id) {
		// TODO Auto-generated method stub
		return userService.getDetails(user_id);
	}

	@Override
	@DeleteMapping("/deleteDetails")
	public ResponseEntity<UserResponseModel> deleteDetails(@PathVariable String user_id) {
		// TODO Auto-generated method stub
		return userService.deleteDetails(user_id);
	}

		
}
