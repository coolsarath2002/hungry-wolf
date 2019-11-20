package com.hungrywolf.feed.api.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hungrywolf.facts.model.generated.Cart;
import com.hungrywolf.facts.model.generated.ChefRating;
import com.hungrywolf.facts.model.generated.ChefRatingDetails;
import com.hungrywolf.facts.model.generated.MealDetails;
import com.hungrywolf.facts.model.generated.Order;
import com.hungrywolf.facts.model.generated.OrderEvent;
import com.hungrywolf.facts.model.generated.OrderStatusTracker;
import com.hungrywolf.feed.api.delegate.ProcessRequestHandler;
import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.feed.api.validator.RequestValidator;

@Controller
public class WolfOrderController {
	
	@Autowired
	@Qualifier("jsonRequestValidator")
	public RequestValidator requestValidator;
	
	@Autowired
	@Qualifier("wolfOrderAPIRequestHandler")
	public ProcessRequestHandler<Order> wolfOrderAPIRequestHandler;
	
	
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/wolf/{wolfId}/placeOrder", method = RequestMethod.POST, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public Order createOrder(@PathVariable("wolfId") String wolfId, @RequestBody Cart cart,@RequestHeader Map<String, String> header,
			HttpServletRequest request) throws HungryWolfAPIException {
		APIRequest apiRequest = new APIRequest();
		
		apiRequest.addRequestProperties("wolfId", wolfId);
		apiRequest.addRequestProperties("role", "wolf");
		APIResponse<Order> apiReponse = wolfOrderAPIRequestHandler.validateAndPerform(apiRequest);
		return apiReponse.getItem();
	}
	
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/chef/{chefId}/order/{orderHWRN}", method = RequestMethod.POST, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public Order updateOrderStatus(@PathVariable("chefId") String chefId, @PathVariable("orderHWRN") String orderHWRN,@RequestHeader Map<String, String> header,
			HttpServletRequest request) throws HungryWolfAPIException {
		APIRequest apiRequest = new APIRequest();
		
		apiRequest.addRequestProperties("chefId", chefId);
		apiRequest.addRequestProperties("role", "chef");
		APIResponse<Order> apiReponse = wolfOrderAPIRequestHandler.validateAndPerform(apiRequest);
		return apiReponse.getItem();
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/chef/{chefId}/order/{orderHWRN}/item/{orderItemHWRN}", method = RequestMethod.POST, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public Order updateOrderItemStatus(@PathVariable("chefId") String chefId, @PathVariable("orderHWRN") @RequestBody OrderEvent orderEvents,@RequestHeader Map<String, String> header,
			HttpServletRequest request) throws HungryWolfAPIException {
		APIRequest apiRequest = new APIRequest();
		
		apiRequest.addRequestProperties("chefId", chefId);
		apiRequest.addRequestProperties("role", "chef");
		APIResponse<Order> apiReponse = wolfOrderAPIRequestHandler.validateAndPerform(apiRequest);
		return apiReponse.getItem();
	}
	
}
