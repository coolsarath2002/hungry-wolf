package com.hungrywolf.feed.api.delegate;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.facts.model.generated.PricingInfos;
import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.service.feed.MealPricingInfoService;
@Service
public class PricingInfoAPIRequestHandler implements ProcessRequestHandler<PricingInfos>{

	@Autowired
	private MealPricingInfoService mealPricingInfoService;
	
	public APIResponse<PricingInfos> get(APIRequest apiRequest) throws HungryWolfAPIException{
		APIResponse<PricingInfos> apiResponse = new APIResponse<PricingInfos>();
		String mealId = apiRequest.getRequestProperties().get("mealId");
		String role = apiRequest.getRequestProperties().get("role");
		PricingInfos pricingInfos = null;
		try {
			switch(role) {
			case "chef":
				 mealPricingInfoService.getChefMealPricing(Integer.parseInt(mealId));
			case "wolf":
				 mealPricingInfoService.getWolfMealPricing(Integer.parseInt(mealId));	
			}
			
			apiResponse.setItem(pricingInfos);
		}catch (Exception ex) {
			apiResponse.setStatusCd(HttpStatus.SC_BAD_GATEWAY);
			apiResponse.setStatusMsg("Not Found");
			throw new HungryWolfAPIException("Something is not right!!!! " + ex);
		}
		return apiResponse;
	}
	
}
