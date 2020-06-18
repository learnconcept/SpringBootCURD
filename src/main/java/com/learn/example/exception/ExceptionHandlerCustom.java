package com.learn.example.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionHandlerCustom {
	
	@ExceptionHandler
	public ResponseEntity<?> handleRecordNotFound(RecordNotFound ex, WebRequest request){
		ExceptionDetails details = new ExceptionDetails(new Date(), ex.getMessage(), request.getDescription(true));
		
		return new ResponseEntity(details, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<?> handleGlobalException(Exception ex, WebRequest request){
		ExceptionDetails details = new ExceptionDetails(new Date(), ex.getMessage(), request.getDescription(true));
		return new ResponseEntity(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
