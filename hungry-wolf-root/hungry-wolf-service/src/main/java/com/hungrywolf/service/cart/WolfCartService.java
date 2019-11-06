package com.hungrywolf.service.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.base.db.repository.RatingRepository;
import com.hungrywolf.base.db.repository.WolfCartRepository;
import com.hungrywolf.facts.model.generated.Cart;
import com.hungrywolf.facts.model.generated.ChefRating;
import com.hungrywolf.facts.model.generated.ChefRatingDetails;

@Service
public class WolfCartService {
	
	@Autowired
	public WolfCartRepository wolfCartRepository;
	
	public ChefRating  getChefRating(Integer chefId) {
		ChefRating customerRating = new ChefRating();
		
		return customerRating;
	}
	
	public Cart getOpenCart(Integer wolfId) {
		Cart openCart = wolfCartRepository.getCartByStatus(wolfId);
		return openCart;
	}

}
