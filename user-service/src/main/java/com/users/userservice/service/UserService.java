/**
 * 
 */
package com.users.userservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.users.userservice.pojo.Users;
import com.users.userservice.pojo.request.UserRequestModel;
import com.users.userservice.pojo.response.UserResponseModel;
import com.users.userservice.repository.UserRepository;
import com.users.userservice.utility.UserInterface;
import com.users.userservice.utility.UserUtilityStatus;

/**
 * @author Vicky Nishad
 *
 */
@Service
public class UserService implements UserInterface{
	
	@Autowired
	private UserRepository userRepository;
	Users users = null;
	List<Users> listOfUsers = null;
	UserResponseModel resModel = null;

	@Override
	public ResponseEntity<UserResponseModel> submitDetails(UserRequestModel userRequestModel) {
		// TODO Auto-generated method stub
		try {
			// create new user
			users = new Users();
			//set the user details coming from userRequestModel
			users.setUser_id(UUID.randomUUID().toString().toUpperCase());
			users.setUser_first_name(userRequestModel.getUser_first_name().toUpperCase());
			users.setUser_middle_name(userRequestModel.getUser_middle_name().toUpperCase());
			users.setUser_last_name(userRequestModel.getUser_last_name().toUpperCase());
			users.setUser_age(userRequestModel.getUser_age().toUpperCase());
			users.setUser_gender(userRequestModel.getUser_gender().toUpperCase());
			users.setUser_martial_status(userRequestModel.getUser_martial_status().toUpperCase());
			users.setUser_mobile_number(userRequestModel.getUser_mobile_number().toLowerCase());
			users.setUser_email_id(userRequestModel.getUser_email_id().toUpperCase());
			users.setUser_aadhar_number(userRequestModel.getUser_aadhar_number().toUpperCase());
			users.setUser_pan_number(userRequestModel.getUser_pan_number().toUpperCase());
			users.setUser_qualification(userRequestModel.getUser_qualification().toUpperCase());
			users.setUser_pincode(userRequestModel.getUser_pincode().toUpperCase());
			users.setUser_city(userRequestModel.getUser_city().toUpperCase());
			users.setUser_state(userRequestModel.getUser_state().toUpperCase());
			users.setUser_country(userRequestModel.getUser_country().toUpperCase());
			
			// save user data in to database
			userRepository.save(users);
			
			resModel = new UserResponseModel(UserUtilityStatus.SUCCESS.toString().toLowerCase(),"new user registered successfully","0",users);
			return new ResponseEntity<UserResponseModel>(resModel, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResponseEntity<UserResponseModel> updateDetails(UserRequestModel userRequestModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<UserResponseModel> getList() {
		// TODO Auto-generated method stub
		try {
			listOfUsers = new ArrayList<Users>();
			listOfUsers = (List<Users>) userRepository.findAll();

			resModel = new UserResponseModel(UserUtilityStatus.SUCCESS.toString().toLowerCase(),"list of users","0",listOfUsers);
			return new ResponseEntity<UserResponseModel>(resModel, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public ResponseEntity<UserResponseModel> getDetails(String user_id) {
		// TODO Auto-generated method stub
		try {
			users = new Users();
			users = userRepository.findById(user_id).orElse(null);

			resModel = new UserResponseModel(UserUtilityStatus.SUCCESS.toString().toLowerCase(),"details of user","0",users);
			return new ResponseEntity<UserResponseModel>(resModel, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public ResponseEntity<UserResponseModel> deleteDetails(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
