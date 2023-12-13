/**
 * 
 */
package com.users.userservice.service;

import org.springframework.http.ResponseEntity;

import com.users.userservice.pojo.UserRequest;

/**
 * @author sudipkumarshaw
 *
 */
public interface UserInterface {
	
	public ResponseEntity<?> submitDetails(UserRequest userRequest);
	public ResponseEntity<?> getDetails();
	public ResponseEntity<?> getDetailById(String userid);
	public ResponseEntity<?> deleteDetails(String userid);

}
