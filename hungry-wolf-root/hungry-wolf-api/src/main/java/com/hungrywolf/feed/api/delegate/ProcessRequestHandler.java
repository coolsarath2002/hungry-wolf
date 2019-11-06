package com.hungrywolf.feed.api.delegate;

import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;

public interface ProcessRequestHandler<T> {
	
	default public APIResponse<T> send(APIRequest apiRequest) throws HungryWolfAPIException{
		return null;
	}

	default public APIResponse<T> insert(APIRequest apiRequest) throws HungryWolfAPIException{
		return null;
	}

	default public APIResponse<T> update(APIRequest apiRequest) throws HungryWolfAPIException{
		return null;
	}

	default public APIResponse<T> delete(APIRequest apiRequest) throws HungryWolfAPIException{
		return null;
	}
	
	default public APIResponse<T> get(APIRequest apiRequest) throws HungryWolfAPIException{
		return null;
	}
	
	default public boolean validate(APIRequest apiRequest) throws HungryWolfAPIException{
		return false;
	}
	
	default public APIResponse<T> validateAndPerform(APIRequest apiRequest) throws HungryWolfAPIException{
		return null;
	}
	
	default public APIResponse<T> performAction(APIRequest apiRequest) throws HungryWolfAPIException{
		return null;
	}
	
}
