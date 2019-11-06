package com.hungrywolf.base.db.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hungrywolf.facts.model.generated.Cart;
import com.hungrywolf.facts.model.generated.CartItems;
import com.hungrywolf.facts.model.generated.MealDetails;

@Repository
public class WolfCartRepository {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	private MealRepository mealRepository;
	
	public static String GET_ACTIVE_CART_FOR_WOLF_ID =  "select wcart.wolf_cart_id,wcart.wolf_cart_status_cd,cartStatus.wolf_cart_status_desc, "+ 
			" wcartItem.meal_id, wcartItem.created_date,wcartItem.quantity" + 
			" from public.wolf_cart wcart " + 
			" join public.wolf_cart_item wcartItem ON wcartItem.wolf_cart_id = wcart.wolf_cart_id " + 
			" join public.cart_status_lookup cartStatus ON cartStatus.wolf_cart_status_cd =  wcart.wolf_cart_status_cd " + 
			" where wcart.wolf_cart_status_cd NOT IN ('C', 'S') AND wcart.wolf_id = :wolfId " + 
			" Order by wcartItem.created_date desc";
		 
	 public Cart getCartByStatus(Integer wolfId) {
		 Map<String, Object> parameters = new HashMap<>();
		 parameters.put("wolfId", wolfId);
		 Cart openCart =  new Cart();
		 namedParameterJdbcTemplate.query(GET_ACTIVE_CART_FOR_WOLF_ID, parameters,  (rs, rowNum) -> {
			 CartItems openCartItems = new CartItems();
			 MealDetails mealDetails = mealRepository.getMealDetails(rs.getInt("meal_id"));
			 //openCartItems.chefId(mealDetails.getMeal().getChef().getId());
			 openCartItems.id(rs.getInt("wolf_cart_id"));
			 openCartItems.mealDetails(mealDetails);
			 openCartItems.isCustomChanges(false);
			 openCartItems.setIsDeleted(false);
			 openCartItems.setQuantity(rs.getInt("quantity"));
			 
			 openCart.addItemsItem(openCartItems);
			
			 return openCartItems;
		 });
		 
		 return openCart;
	 }
	 
	 public static String UPDATE_ACTIVE_CART_FOR_STATUS =  " Update public.wolf_cart wcart\n" + 
	 		" SET wolf_cart_status_cd = :newWolfCartStatusCd" + 
	 		" where wolf_cart_status_cd = :currentWolfCartStatusCd AND wolf_cart_id = :wolfCartId ";
	 
	 public void updateCartStatus(Integer wolfCartId, String newWolfCartStatusCd,String currentWolfCartStatusCd) {
		 Map<String, Object> parameters = new HashMap<>();
		 parameters.put("wolfCartId", wolfCartId);
		 parameters.put("newWolfCartStatusCd", newWolfCartStatusCd);
		 parameters.put("currentWolfCartStatusCd", currentWolfCartStatusCd);
		 namedParameterJdbcTemplate.update(UPDATE_ACTIVE_CART_FOR_STATUS, parameters);
	 }
}
