package com.learn.example.exception;

import java.util.Date;

public class ExceptionDetails {
	private Date timeStamp;
	private String message;
	private String urlDetails;
	
	public ExceptionDetails(Date timeStamp, String message, String urlDetails) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.urlDetails = urlDetails;
	}
}
