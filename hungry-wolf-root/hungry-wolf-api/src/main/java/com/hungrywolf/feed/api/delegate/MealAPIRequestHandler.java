package com.hungrywolf.feed.api.delegate;

import java.util.logging.Logger;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hungrywolf.facts.model.generated.Meal;
import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.service.feed.MealService;

@Component
public class MealAPIRequestHandler implements ProcessRequestHandler<Meal>{
	
	private final Logger LOGGER = Logger.getLogger(this.getClass().getName());
	@Autowired
	public MealService mealService;
	
	@Override
	public APIResponse<Meal> get(APIRequest apiRequest) throws HungryWolfAPIException {
		APIResponse<Meal> apiResponse = new APIResponse<Meal>();
		String mealId = apiRequest.getRequestProperties().get("mealId");
		try {
			Meal meal = mealService.findMealById(Integer.parseInt(mealId));
			apiResponse.setItem(meal);
		}catch (Exception ex) {
			apiResponse.setStatusCd(HttpStatus.SC_BAD_GATEWAY);
			apiResponse.setStatusMsg("Not Found");
			throw new HungryWolfAPIException("Something is not right!!!! " + ex);
		}
		return apiResponse;
	}
	
	

	
}
