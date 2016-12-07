package com.sjc.hrms.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.FORBIDDEN, reason="Access restriction")
public class AccessException extends ServiceException{

	public AccessException(String message) {
		super(message);
	}

}
