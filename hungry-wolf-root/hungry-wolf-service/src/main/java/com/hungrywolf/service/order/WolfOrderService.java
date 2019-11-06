package com.hungrywolf.service.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.base.db.repository.RatingRepository;
import com.hungrywolf.base.db.repository.WolfCartRepository;
import com.hungrywolf.base.db.repository.WolfOrderRepository;
import com.hungrywolf.facts.model.generated.Cart;
import com.hungrywolf.facts.model.generated.ChefRating;
import com.hungrywolf.facts.model.generated.ChefRatingDetails;
import com.hungrywolf.facts.model.generated.Order;

@Service
public class WolfOrderService {
	
	@Autowired
	public WolfOrderRepository wolfOrderRepository;
	
	public ChefRating  getChefRating(Integer chefId) {
		ChefRating customerRating = new ChefRating();
		
		return customerRating;
	}
	
	public Order createNewOrder(Order newOrder) {
		
		return null;
	}

}
