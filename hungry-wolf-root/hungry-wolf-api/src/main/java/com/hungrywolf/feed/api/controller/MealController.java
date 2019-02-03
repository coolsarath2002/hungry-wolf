package com.hungrywolf.feed.api.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hungrywolf.facts.Meal;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.feed.api.validator.RequestValidator;
import org.springframework.http.HttpStatus;

@RestController
public class MealController {
	
	@Autowired
	@Qualifier("jsonRequestValidator")
	public RequestValidator requestValidator;
	
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/meals", method = RequestMethod.GET, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public APIResponse<Object> getAllMealsForToday(@PathVariable("today") String date) {
		APIRequest apiRequest = new APIRequest();
		apiRequest.getRequestProperties().put("date", date);
		
		
		return null;
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/meals/status/{status}", method = RequestMethod.GET, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public APIResponse<Object> getAvailableMeals(@PathVariable("date") String date) {
		APIRequest apiRequest = new APIRequest();
		apiRequest.getRequestProperties().put("date", date);
		
		
		return null;
	}
	
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/meals/meal/{mealId}", method = RequestMethod.PUT, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public APIResponse<Object> updateMeals(@RequestBody Meal meal, @RequestHeader Map<String, String> header,
			HttpServletRequest request) {
		APIRequest apiRequest = new APIRequest();
		apiRequest.setRequestObject(meal);
		
		
		
		return null;
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/meals/meal/{mealId}", method = RequestMethod.DELETE, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public APIResponse<Object> deleteMeals(@PathVariable("mealId") String mealId) {
		APIRequest apiRequest = new APIRequest();
		apiRequest.getRequestProperties().put("mealId", mealId);
		
		
		return null;
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/meals/zipcode/{zipcode}", method = RequestMethod.GET, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public APIResponse<Object> mealsByZipCode(@PathVariable("zipcode") String zipcode) {
		APIRequest apiRequest = new APIRequest();
		apiRequest.getRequestProperties().put("zipcode", zipcode);
		
		
		return null;
	}
	
	
	
	

}
