package com.hungrywolf.feed.api.exception;

public class SimpleAPIExceptionProvider implements APIExceptionProvider{

	@Override
	public APIException doException(String message) {
		// TODO Auto-generated method stub
		return new APIException(message);
	}

	public static APIExceptionProvider getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
