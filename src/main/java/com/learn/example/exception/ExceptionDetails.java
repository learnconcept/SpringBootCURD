package com.learn.example.exception;

import java.util.Date;

public class ExceptionDetails {
	private Date timeStamp;
	private String message;
	private String urlDetails;
	
	
	public Date getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getUrlDetails() {
		return urlDetails;
	}


	public void setUrlDetails(String urlDetails) {
		this.urlDetails = urlDetails;
	}


	public ExceptionDetails() {
		super();
	}


	public ExceptionDetails(Date timeStamp, String message, String urlDetails) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.urlDetails = urlDetails;
	}
}
