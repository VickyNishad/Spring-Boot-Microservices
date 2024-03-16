package com.users.userservice.pojo.response;

public class UserResponseModel {

	private String status;
	private String message;
	private String statusCode;
	private Object result;

	public UserResponseModel(String status, String message, String statusCode, Object result) {
		super();
		this.status = status;
		this.message = message;
		this.statusCode = statusCode;
		this.result = result;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the result
	 */
	public Object getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(Object result) {
		this.result = result;
	}

	public UserResponseModel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserResponseModel [status=" + status + ", message=" + message + ", statusCode=" + statusCode
				+ ", result=" + result + "]";
	}

}
