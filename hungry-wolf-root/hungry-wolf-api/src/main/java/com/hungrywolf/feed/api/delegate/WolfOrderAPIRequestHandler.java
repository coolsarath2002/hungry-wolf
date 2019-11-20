package com.hungrywolf.feed.api.delegate;

import java.util.Iterator;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.base.db.helper.OrderUtils;
import com.hungrywolf.facts.model.generated.Cart;
import com.hungrywolf.facts.model.generated.CartItems;
import com.hungrywolf.facts.model.generated.ChefRating;
import com.hungrywolf.facts.model.generated.ChefRatingDetails;
import com.hungrywolf.facts.model.generated.Meal;
import com.hungrywolf.facts.model.generated.Order;
import com.hungrywolf.facts.model.generated.OrderItems;
import com.hungrywolf.facts.model.generated.PricingInfos;
import com.hungrywolf.facts.model.generated.Rating;
import com.hungrywolf.facts.model.generated.RatingDetails;
import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.model.APIRequest;
import com.hungrywolf.feed.api.model.APIResponse;
import com.hungrywolf.service.cart.WolfCartService;
import com.hungrywolf.service.feed.MealPricingInfoService;
import com.hungrywolf.service.feed.MealService;
import com.hungrywolf.service.order.WolfOrderService;
import com.hungrywolf.service.review.ChefRatingService;
@Service
public class WolfOrderAPIRequestHandler implements ProcessRequestHandler<Order>{

	@Autowired
	private WolfOrderService wolfOrderService;
	
	@Autowired
	private WolfCartService wolfCartService;
	
	
	
	public APIResponse<Order> validateAndPerform(APIRequest apiRequest) throws HungryWolfAPIException{
		APIResponse<Order> apiResponse = new APIResponse<Order>();
		String wolfId = apiRequest.getRequestProperties().get("wolfId");
		String role = apiRequest.getRequestProperties().get("role");
		Cart openCart = (Cart)apiRequest.getRequestObject();
		
		if(openCart == null) {
			openCart = wolfCartService.getOpenCart(Integer.parseInt(wolfId));
		
		wolfOrderService.createNewOrder(openCart, wolfId);
		
		
		//Check if the order close-by time is not elapsed
		//check if the quantity of the order exist.
		
		/*try {
			switch(role) {
			
			
			apiResponse.setItem(newOrder);
		}catch (Exception ex) {
			apiResponse.setStatusCd(HttpStatus.SC_BAD_GATEWAY);
			apiResponse.setStatusMsg("Not Found");
			throw new HungryWolfAPIException("Something is not right!!!! " + ex);
		}*/
		
		}
		return apiResponse;
	
}
}
