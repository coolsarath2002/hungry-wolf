package com.hungrywolf.feed.api.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.joda.time.LocalDate;
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

import com.hungrywolf.facts.model.generated.Meal;
import com.hungrywolf.facts.model.generated.MealDetails;
import com.hungrywolf.facts.model.generated.Meals;
import com.hungrywolf.facts.model.generated.MealsSearch;
import com.hungrywolf.feed.api.delegate.ProcessRequestHandler;
import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.feed.api.validator.RequestValidator;
import com.hungrywolf.service.data.loader.MealBulkLoader;
import com.hungrywolf.service.feed.MealService;

import net.sf.ehcache.config.Searchable;

import org.springframework.http.HttpStatus;

@RestController
public class MealController {
	
	@Autowired
	@Qualifier("jsonRequestValidator")
	public RequestValidator requestValidator;
	
	
	@Autowired
	@Qualifier("mealAPIRequestHandler")
	public ProcessRequestHandler<Meal> mealRequestHandler;
	
	@Autowired
	@Qualifier("mealsAPIRequestHandler")
	public ProcessRequestHandler<Meals> mealsRequestHandler;
	
	@Autowired
	@Qualifier("mealDetailsAPIRequestHandler")
	public ProcessRequestHandler<MealDetails> mealDetailsAPIRequestHandler;

	@Autowired
	public MealBulkLoader mealbulkLoader;
	
	
	
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/meals/today", method = RequestMethod.GET, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public Meals getAllMealsForToday() throws HungryWolfAPIException {
		APIRequest apiRequest = new APIRequest();
		LocalDate today = new LocalDate().plusDays(1);
		APIResponse<Meals> apiReponse = mealsRequestHandler.get(apiRequest);
		return apiReponse.getItem();
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
	@RequestMapping(value = "/meals/meal/{mealId}", method = RequestMethod.GET, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public MealDetails updateMeals(@PathVariable("mealId") String mealId, @RequestHeader Map<String, String> header,
			HttpServletRequest request) throws HungryWolfAPIException {
		APIRequest apiRequest = new APIRequest();
		
		apiRequest.addRequestProperties("mealId", mealId);
		APIResponse<MealDetails> apiReponse = mealDetailsAPIRequestHandler.get(apiRequest);
		return apiReponse.getItem();
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/meals/meal/{mealId}", method = RequestMethod.DELETE, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public MealDetails deleteMeals(@PathVariable("mealId") String mealId) {
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
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/meals/bulkupload", method = RequestMethod.GET, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public APIResponse<Object> bulkupload() {
		//mealbulkLoader.createMealsDetails();
		return null;
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/meals/byTags", method = RequestMethod.POST, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public Meals mealByTags(@RequestBody MealsSearch search) throws HungryWolfAPIException {
		APIRequest apiRequest = new APIRequest();
		apiRequest.setRequestObject(search.getCriteria());
		apiRequest.addRequestProperties("criteriaType", "tag");
		APIResponse<Meals> apiReponse = mealsRequestHandler.get(apiRequest);
		return apiReponse.getItem();
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/meals/byChef", method = RequestMethod.POST, consumes = { "application/json",
			"application/octet-stream" }, produces = { "application/json", "application/octet-stream" })
	public Meals mealByChef(@RequestBody MealsSearch search) throws HungryWolfAPIException {
		APIRequest apiRequest = new APIRequest();
		apiRequest.setRequestObject(search.getCriteria());
		apiRequest.addRequestProperties("criteriaType", "chef");
		APIResponse<Meals> apiReponse = mealsRequestHandler.get(apiRequest);
		return apiReponse.getItem();
	}
}
