package com.springsecurity.entity;

public class JWTResponse {

	public JWTResponse() {
		// TODO Auto-generated constructor stub
	}

	private String access_token;
	private String auth_type;
	private String token_expiry;

	@Override
	public String toString() {
		return "JWTResponse [access_token=" + access_token + ", auth_type=" + auth_type + ", token_expiry="
				+ token_expiry + "]";
	}

	/**
	 * @return the auth_type
	 */
	public String getAuth_type() {
		return auth_type;
	}

	/**
	 * @param auth_type the auth_type to set
	 */
	public void setAuth_type(String auth_type) {
		this.auth_type = auth_type;
	}

	/**
	 * @return the access_token
	 */
	public String getAccess_token() {
		return access_token;
	}

	/**
	 * @param access_token the access_token to set
	 */
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	/**
	 * @return the token_expiry
	 */
	public String getToken_expiry() {
		return token_expiry;
	}

	/**
	 * @param token_expiry the token_expiry to set
	 */
	public void setToken_expiry(String token_expiry) {
		this.token_expiry = token_expiry;
	}

}
