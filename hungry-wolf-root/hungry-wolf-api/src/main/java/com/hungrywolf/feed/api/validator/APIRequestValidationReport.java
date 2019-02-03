package com.hungrywolf.feed.api.validator;

import java.util.LinkedList;
import java.util.List;

import com.hungrywolf.feed.api.exception.APIExceptionProvider;
import com.hungrywolf.feed.api.exception.SimpleAPIExceptionProvider;
import com.hungrywolf.feed.api.model.APIRequestMessage;

public class APIRequestValidationReport {
	
	private boolean validRequest;
	private List<APIRequestMessage> message=new  LinkedList<APIRequestMessage>();
	private APIExceptionProvider exceptionProvider = SimpleAPIExceptionProvider.getInstance();
	public boolean isValidRequest() {
		return validRequest;
	}
	public void setValidRequest(boolean validRequest) {
		this.validRequest = validRequest;
	}
	public List<APIRequestMessage> getMessage() {
		return message;
	}
	public void setMessage(List<APIRequestMessage> message) {
		this.message = message;
	}

}
