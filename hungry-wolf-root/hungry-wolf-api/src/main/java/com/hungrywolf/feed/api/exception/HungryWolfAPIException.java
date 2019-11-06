package com.hungrywolf.feed.api.exception;

import com.hungrywolf.feed.api.model.APIResponse;

public class HungryWolfAPIException extends APIException{

	private static final long serialVersionUID = 1L;
	private APIResponse apiResponse;
	
	
	public HungryWolfAPIException(){
		super();
	}
	
	public HungryWolfAPIException(APIResponse<?> apiResponse){
		super();
		this.apiResponse = apiResponse;
	}
	
	public HungryWolfAPIException(String e){
		super(e);
	}
	
	public HungryWolfAPIException(Throwable e){
		super(e);
	}
	
	public HungryWolfAPIException(String message,Throwable e){
		super(message,e);
	}
	
	public HungryWolfAPIException(String message,Throwable e,APIResponse<?> apiResponse){
		super(message,e);
		this.apiResponse = apiResponse;
	}
}
