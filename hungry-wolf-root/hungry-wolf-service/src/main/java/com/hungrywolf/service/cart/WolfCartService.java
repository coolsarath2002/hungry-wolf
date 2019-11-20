package com.hungrywolf.service.cart;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.base.db.repository.RatingRepository;
import com.hungrywolf.base.db.repository.WolfCartRepository;
import com.hungrywolf.facts.model.generated.Cart;
import com.hungrywolf.facts.model.generated.CartItems;
import com.hungrywolf.facts.model.generated.ChefRating;
import com.hungrywolf.facts.model.generated.ChefRatingDetails;

@Service
public class WolfCartService {
	
	@Autowired
	public WolfCartRepository wolfCartRepository;
	
	public Cart getOpenCart(Integer wolfId) {
		Cart openCart = wolfCartRepository.getCartByStatus(wolfId);
		return openCart;
	}

	public void softDeleteCartItem(CartItems cartItemsItr) {
		wolfCartRepository.removeItem(cartItemsItr);
	}
	
	public void softDeleteCart(Cart cart) {
		wolfCartRepository.remove(cart);
	}

}
