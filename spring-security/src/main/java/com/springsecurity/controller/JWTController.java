package com.springsecurity.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.entity.FinalResponse;
import com.springsecurity.entity.JWTRequest;
import com.springsecurity.entity.JWTResponse;
import com.springsecurity.security.JWTHelper;

@RestController
@RequestMapping("api/v1/auth")
public class JWTController {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private AuthenticationManager manager;

	@Autowired
	private JWTHelper helper;

	public JWTController() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/generateToken")
	public ResponseEntity<?> login(@RequestBody JWTRequest request) {

		try {
			this.doAuthenticate(request.getUser_name(), request.getPassword());

			UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUser_name());
			
			String token = this.helper.generateToken(userDetails.getUsername());

			JWTResponse jwtResponse = new JWTResponse();
			jwtResponse.setAccess_token(token);
			jwtResponse.setAuth_type("Bearer Token");
			jwtResponse.setToken_expiry("");

			FinalResponse response = new FinalResponse();
			response.setStatus("success");
			response.setErrorCode("0");
			response.setMessage("access token generated succesful ");
			response.setResult(jwtResponse);
			return new ResponseEntity<FinalResponse>(response, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	private void doAuthenticate(String user_name, String password) {

		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user_name,
				password);
		try {
			manager.authenticate(authentication);

		} catch (BadCredentialsException e) {
			throw new BadCredentialsException(" Invalid Username or Password  !!");
		}

	}

	@ExceptionHandler(BadCredentialsException.class)
	public HashMap<String, Object> exceptionHandler() {
		HashMap<String, Object> response = new HashMap<String, Object>();
		response.put("status", "Bad request");
		response.put("message", "Credentials Invalid !!");
		response.put("errorcode", "400");
		return response;
	}

}
