package com.hungrywolf.service.order;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.base.db.helper.OrderUtils;
import com.hungrywolf.base.db.repository.WolfOrderRepository;
import com.hungrywolf.facts.model.generated.Cart;
import com.hungrywolf.facts.model.generated.CartItems;
import com.hungrywolf.facts.model.generated.Order;
import com.hungrywolf.facts.model.generated.OrderItems;
import com.hungrywolf.facts.model.generated.OrderItems.DeliveryMethodEnum;
import com.hungrywolf.service.cart.WolfCartService;
import com.hungrywolf.service.feed.MealService;

@Service
public class WolfOrderService {
	
	@Autowired
	public WolfOrderRepository wolfOrderRepository;
	
	@Autowired
	private WolfCartService wolfCartService;
	
	@Autowired
	private MealService mealService;

	private static Random rndm=new Random();
	
	
	public Order createNewOrder(Cart openCart, String wolfId) {
		//Check meals in the cart are still available.
		Order newOrder = buildOrder(openCart, wolfId);
		if(openCart!=null && openCart.getItems() !=null && openCart.getItems().size() > 0) {
			Iterator<CartItems> cartItemsItr = openCart.getItems().iterator();
			while(cartItemsItr.hasNext()) {
				CartItems nextItem = cartItemsItr.next();
				String timeLeft = mealService.calculateTimeLeft(nextItem.getMealDetails().getMealServing());
				if(mealService.checkAvailability(nextItem.getMealDetails(),nextItem.getQuantity()) && !timeLeft.contains("Overdue")) {
					if(newOrder==null)
						newOrder = buildOrder(openCart, wolfId);
					
					OrderItems newOrderItems = buildOrderItem(newOrder.getOrderHwrn(), nextItem, wolfId);
					if(newOrderItems!=null) {
						newOrder.addItemsItem(newOrderItems);
					}
				}else {
					cartItemsItr.remove();
					wolfCartService.softDeleteCartItem(nextItem);
				}
			}
			
			if(openCart.getItems()!=null && openCart.getItems().size() == 0) {
				wolfCartService.softDeleteCart(openCart);
			}
			//
			persistOrder(newOrder,Integer.parseInt(wolfId));
			
		}
		return newOrder;
	}
	
	
	public Order persistOrder(Order newOrder,Integer wolfId) {
		int orderID = wolfOrderRepository.insertOrder(newOrder,wolfId);
		newOrder.setId(orderID);
		if(newOrder!=null && newOrder.getItems()!=null &&  newOrder.getItems().size() > 0) {
			for(OrderItems orderItem:newOrder.getItems()) {
				wolfOrderRepository.insertOrderItem(orderItem, newOrder);
				
				mealService.updateQuantity(orderItem.getMealDetails(),orderItem.getQuantity());
			}
		}
		
		return newOrder;
	}
	
	
	
	
	public Order buildOrder(Cart openCart,String wolfId) {
		Order newOrder = new Order();
		
		if(openCart == null)
			return null;
		newOrder.setCartId(openCart.getId());
		newOrder.orderHwrn(OrderUtils.buildOrderHWRN(wolfId, String.valueOf(rndm.nextInt(99999))));
		newOrder.orderPlacedDate(ZonedDateTime.now());
		newOrder.createdDate(ZonedDateTime.now());
		newOrder.modifiedDate(ZonedDateTime.now());
		
		return newOrder;
	}

	public OrderItems buildOrderItem(String orderHWRN, CartItems openCartItem,String wolfId) {
		OrderItems newOrderItem = new OrderItems();
		
		if(openCartItem == null || openCartItem.getMealDetails() == null)
			return null;
		newOrderItem.cartItemId(openCartItem.getId());
		newOrderItem.mealDetails(openCartItem.getMealDetails());
		newOrderItem.quantity(openCartItem.getQuantity());
		newOrderItem.setOrderItemHWRN(OrderUtils.buildOrderItemHWRN(orderHWRN, String.valueOf(rndm.nextInt(99999))));
		//newOrderItem.chefId(openCartItem.getMealDetails().getMeal().getChef().getId());
		newOrderItem.createdDate(ZonedDateTime.now());
		newOrderItem.modifiedDate(ZonedDateTime.now());
		newOrderItem.isCustomChanges(openCartItem.isIsCustomChanges());
		newOrderItem.deliveryMethod(DeliveryMethodEnum.P);
		newOrderItem.scheduleDeliveryDate(openCartItem.getMealDetails().getMealServing().getScheduledDeliveryDate());
		return newOrderItem;
	}
	
	
}
