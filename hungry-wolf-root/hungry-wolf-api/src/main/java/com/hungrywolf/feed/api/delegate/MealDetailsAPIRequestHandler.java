package com.hungrywolf.feed.api.delegate;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hungrywolf.facts.model.generated.MealDetails;
import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.service.feed.MealService;

@Component
public class MealDetailsAPIRequestHandler implements ProcessRequestHandler<MealDetails>{

	@Autowired
	private MealService mealService;
	
	@Override
	public APIResponse<MealDetails> get(APIRequest apiRequest) throws HungryWolfAPIException {
		APIResponse<MealDetails> apiResponse = new APIResponse<MealDetails>();
		String mealId = apiRequest.getRequestProperties().get("mealId");
		try {
			MealDetails mealDetails = mealService.getMealDetails(mealId);
			apiResponse.setItem(mealDetails);
		}catch (Exception ex) {
			apiResponse.setStatusCd(HttpStatus.SC_BAD_GATEWAY);
			apiResponse.setStatusMsg("Not Found");
			throw new HungryWolfAPIException("Something is not right!!!! " + ex);
		}
		return apiResponse;
	}
}
