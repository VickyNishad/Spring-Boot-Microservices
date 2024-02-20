/**
 * 
 */
package com.users.userservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.users.userservice.exception.CustomeException;
import com.users.userservice.pojo.UserRequest;
import com.users.userservice.pojo.Users;
import com.users.userservice.repository.UserRepository;

/**
 * @author Vicky Nishad
 *
 */
@Service
public class UserService implements UserInterface{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public ResponseEntity<?> submitDetails(UserRequest userRequest) {
		try {
			Users users = new Users();
			users.setUserid(userRequest.getUserid());
			users.setUser_name(userRequest.getUser_name());
			users.setUser_contact(userRequest.getUser_contact());
			users.setUser_email(userRequest.getUser_email());
			
			Users user =  userRepository.save(users);
			
			return new ResponseEntity<Users>(user,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> getDetails() {
		// TODO Auto-generated method stub
		try {
			Users users = new Users();
			List<Users> allUser = new ArrayList<>();
			Iterable<Users> itrUsers = userRepository.findAll();
			
			if(allUser.isEmpty()) {
				throw new CustomeException("data not found",null);
			}
			
			
			itrUsers.forEach(user->{
				users.setUserid(user.getUserid());
				users.setUser_name(user.getUser_name());
				users.setUser_contact(user.getUser_contact());
				users.setUser_email(user.getUser_email());
				allUser.add(users);
				throw new CustomeException("data not mismatch",null);
				
			});
			return new ResponseEntity<List<Users>>(allUser,HttpStatus.OK);

		} catch (Exception e) {
			// TODO: handle exception
			throw new CustomeException(e.getMessage());
		}
	}

	@Override
	public ResponseEntity<?> getDetailById(String userid) {
		// TODO Auto-generated method stub
		try {
			Optional<Users> OpUser = userRepository.findById(userid);
			List<Users> list = new ArrayList<>();
			list.add(OpUser.get());
			return new ResponseEntity<List<Users>>(list,HttpStatus.OK);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public ResponseEntity<?> deleteDetails(String userid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
