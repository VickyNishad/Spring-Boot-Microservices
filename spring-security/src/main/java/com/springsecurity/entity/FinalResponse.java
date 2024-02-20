package com.springsecurity.entity;

public class FinalResponse {

	public FinalResponse() {
		// TODO Auto-generated constructor stub
	}

	private String status;
	private String errorCode;
	private String message;
	private Object result;

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
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public FinalResponse(String status, String errorCode, String message, Object result) {
		super();
		this.status = status;
		this.errorCode = errorCode;
		this.message = message;
		this.result = result;
	}

	@Override
	public String toString() {
		return "FinalResponse [status=" + status + ", errorCode=" + errorCode + ", message=" + message + ", result="
				+ result + "]";
	}

}
