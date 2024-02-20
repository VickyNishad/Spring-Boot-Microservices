/**
 * 
 */
package com.document.service.pojo;

import java.io.Serializable;

/**
 * 
 */
public class ApiResponse implements Serializable  {


	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ApiResponse() {
		// TODO Auto-generated constructor stub
	}

	private String statusCode;
	private String message;
	private Object data;

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
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	public ApiResponse(String statusCode, String message, Object data) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "CommonResponse [statusCode=" + statusCode + ", message=" + message + ", data=" + data + "]";
	}

}
