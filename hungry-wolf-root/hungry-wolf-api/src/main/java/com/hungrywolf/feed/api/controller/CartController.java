package com.hungrywolf.feed.api.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hungrywolf.facts.model.generated.Cart;
import com.hungrywolf.facts.model.generated.ChefRating;
import com.hungrywolf.facts.model.generated.ChefRatingDetails;
import com.hungrywolf.facts.model.generated.MealDetails;
import com.hungrywolf.feed.api.delegate.ProcessRequestHandler;
import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.feed.api.validator.RequestValidator;

@Controller
public class CartController {
	
	@Autowired
	@Qualifier("jsonRequestValidator")
	public RequestValidator requestValidator;
	
	@Autowired
	@Qualifier("wolfCartAPIRequestHandler")
	public ProcessRequestHandler<Cart> wolfCartAPIRequestHandler;
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/wolf/{wolfId}/cart", method = RequestMethod.GET, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public Cart getChefRating(@PathVariable("wolfId") String wolfId, @RequestHeader Map<String, String> header,
			HttpServletRequest request) throws HungryWolfAPIException {
		APIRequest apiRequest = new APIRequest();
		
		apiRequest.addRequestProperties("wolfId", wolfId);
		apiRequest.addRequestProperties("role", "wolf");
		APIResponse<Cart> apiReponse = wolfCartAPIRequestHandler.get(apiRequest);
		return apiReponse.getItem();
	}
	
}