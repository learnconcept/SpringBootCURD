package com.learn.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecordNotFound extends Exception{

	private static final long serialVersionUID = -2209722178088423789L;

	public RecordNotFound(String message) {
		super(message);
	}
}
