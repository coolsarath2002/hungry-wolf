package com.hungrywolf.feed.api.exception;

public class HungryWolfAPIException extends APIException{

	private static final long serialVersionUID = 1L;

	public HungryWolfAPIException(){
		super();
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

}
