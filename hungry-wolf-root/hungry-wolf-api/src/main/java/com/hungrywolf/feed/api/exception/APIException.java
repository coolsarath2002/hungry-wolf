package com.hungrywolf.feed.api.exception;

public class APIException extends Exception {

	
	
	private static final long serialVersionUID = 1L;

	public APIException(){
		super();
	}
	
	public APIException(String e){
		super(e);
	}

	public APIException(Throwable e){
		super(e);
	}
	
	public APIException(String message,Throwable e){
		super(message,e);
	}
}