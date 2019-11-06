package com.hungrywolf.feed.api.delegate;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.facts.model.generated.Cart;
import com.hungrywolf.facts.model.generated.ChefRating;
import com.hungrywolf.facts.model.generated.ChefRatingDetails;
import com.hungrywolf.facts.model.generated.PricingInfos;
import com.hungrywolf.facts.model.generated.Rating;
import com.hungrywolf.facts.model.generated.RatingDetails;
import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.service.cart.WolfCartService;
import com.hungrywolf.service.feed.MealPricingInfoService;
import com.hungrywolf.service.review.ChefRatingService;
@Service
public class WolfCartAPIRequestHandler implements ProcessRequestHandler<Cart>{

	@Autowired
	private WolfCartService wolfCartService;
	
	public APIResponse<Cart> get(APIRequest apiRequest) throws HungryWolfAPIException{
		APIResponse<Cart> apiResponse = new APIResponse<Cart>();
		String wolfId = apiRequest.getRequestProperties().get("wolfId");
		String role = apiRequest.getRequestProperties().get("role");
		Cart openCart = null;
		try {
			switch(role) {
			case "wolf":
				openCart = wolfCartService.getOpenCart(Integer.parseInt(wolfId));
			}
			
			apiResponse.setItem(openCart);
		}catch (Exception ex) {
			apiResponse.setStatusCd(HttpStatus.SC_BAD_GATEWAY);
			apiResponse.setStatusMsg("Not Found");
			throw new HungryWolfAPIException("Something is not right!!!! " + ex);
		}
		return apiResponse;
	}
	
}
