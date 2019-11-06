package com.hungrywolf.feed.api.delegate;

import java.util.List;
import java.util.logging.Logger;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.hungrywolf.facts.model.generated.Meal;
import com.hungrywolf.facts.model.generated.Meals;
import com.hungrywolf.facts.model.generated.SearchCriteria;
import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.service.feed.MealService;

@Component
public class MealsAPIRequestHandler implements ProcessRequestHandler<Meals>{
	
	private final Logger LOGGER = Logger.getLogger(this.getClass().getName());
	@Autowired
	public MealService mealService;
	
	@Override
	public APIResponse<Meals> get(APIRequest apiRequest) throws HungryWolfAPIException {
		APIResponse<Meals> apiResponse = new APIResponse<Meals>();
		String criteria = apiRequest.getRequestProperties().get("criteriaType");
		Meals meals = null;
		try {
			@SuppressWarnings("unchecked")
			List<SearchCriteria> requestObject = (List<SearchCriteria>)apiRequest.getRequestObject();
			switch(criteria) {
			case "chef":
				{
					List<SearchCriteria> filter = requestObject;
					meals = mealService.findMealsByChef(filter.get(0));
					break;
				}
			case "tag":
				{
					List<SearchCriteria> filter = requestObject;
					meals = mealService.findMealsByTag(filter.get(0));
					break;
				}
			default:
				{
					meals = mealService.findMealsbyCriteria();
					break;
				}
				
			}
			apiResponse.setItem(meals);
			
		}catch (Exception ex) {
			apiResponse.setStatusCd(HttpStatus.SC_BAD_GATEWAY);
			apiResponse.setStatusMsg("Not Found");
			throw new HungryWolfAPIException("Something is not right!!!! " + ex);
		}
		
		return apiResponse;
	}

	
}
