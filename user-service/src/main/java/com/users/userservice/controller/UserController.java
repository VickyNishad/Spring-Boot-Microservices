/**
 * 
 */
package com.users.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.userservice.pojo.UserRequest;
import com.users.userservice.service.UserInterface;
import com.users.userservice.service.UserService;

/**
 * @author Vicky Nishad
 *
 */
@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController implements UserInterface{
	
	// this is initial routes
	public final static String BASE_URL="api/v1/user";
	
	@Autowired
	private UserService userService;

	@Override
	@PostMapping
	public ResponseEntity<?> submitDetails(@RequestBody UserRequest userRequest) {
		// TODO Auto-generated method stub
		return userService.submitDetails(userRequest);
	}

	@Override
	@GetMapping
	public ResponseEntity<?> getDetails() {
		// TODO Auto-generated method stub
		return userService.getDetails();
	}

	@Override
	@GetMapping("/{userid}")
	public ResponseEntity<?> getDetailById(@PathVariable String userid) {
		// TODO Auto-generated method stub
		return userService.getDetailById(userid);
	}

	@Override
	public ResponseEntity<?> deleteDetails( String userid) {
		// TODO Auto-generated method stub
		return null;
	}

}
