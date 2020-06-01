package com.campushaat.rangerapp.response;

public class BaseResponse {
	
	private String statusCode;
	private String message;
	private String APIKey;
	private String orderId;

	public BaseResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseResponse(String statusCode) {
		
		super();
		this.statusCode = statusCode;
	}

	public BaseResponse(String statusCode, String message) {
		
		super();
		this.statusCode = statusCode;
		this.message = message;
	}
	
	/**
	 * @param statusCode
	 * @param message
	 * @param aPIKey
	 */
	public BaseResponse(String statusCode, String message, String aPIKey) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		APIKey = aPIKey;
	}

	/**
	 * @param statusCode
	 * @param message
	 * @param aPIKey
	 * @param orderId
	 */
	public BaseResponse(String statusCode, String message, String aPIKey, String orderId) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		APIKey = aPIKey;
		this.orderId = orderId;
	}

	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getAPIKey() {
		return APIKey;
	}

	public void setAPIKey(String aPIKey) {
		APIKey = aPIKey;
	}

	public synchronized String getOrderId() {
		return orderId;
	}

	public synchronized void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}
