package com.hungrywolf.feed.api.delegate;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.facts.model.generated.ChefRating;
import com.hungrywolf.facts.model.generated.ChefRatingDetails;
import com.hungrywolf.facts.model.generated.PricingInfos;
import com.hungrywolf.facts.model.generated.Rating;
import com.hungrywolf.facts.model.generated.RatingDetails;
import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.service.feed.MealPricingInfoService;
import com.hungrywolf.service.review.ChefRatingService;
@Service
public class ChefRatingAPIRequestHandler implements ProcessRequestHandler<ChefRating>{

	@Autowired
	private ChefRatingService chefRatingService;
	
	public APIResponse<ChefRating> get(APIRequest apiRequest) throws HungryWolfAPIException{
		APIResponse<ChefRating> apiResponse = new APIResponse<ChefRating>();
		String chefId = apiRequest.getRequestProperties().get("chefId");
		String role = apiRequest.getRequestProperties().get("role");
		ChefRating chefRating = null;
		try {
			switch(role) {
			case "chef":
				chefRating = chefRatingService.getChefRating(Integer.parseInt(chefId));
			}
			
			apiResponse.setItem(chefRating);
		}catch (Exception ex) {
			apiResponse.setStatusCd(HttpStatus.SC_BAD_GATEWAY);
			apiResponse.setStatusMsg("Not Found");
			throw new HungryWolfAPIException("Something is not right!!!! " + ex);
		}
		return apiResponse;
	}
	
}
