package com.hungrywolf.base.db.repository;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.hungrywolf.base.db.helper.OrderUtils;
import com.hungrywolf.facts.model.generated.Order;
import com.hungrywolf.facts.model.generated.OrderItems;
import com.hungrywolf.facts.model.generated.OrderItems.DeliveryMethodEnum;

@Repository
public class WolfOrderRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	 private static String INSERT_NEW_ORDER = "INSERT INTO public.wolf_order " + 
	 "	( wolf_cart_id, wolf_id, wolf_order_status_cd, created_date, modified_date, wolf_order_hwrn,order_placed_date,created_by, modified_by) "
	 + "VALUES ( :wolf_cart_id, :wolf_id, :wolf_order_status_cd, NOW(), NOW(), :wolf_order_hwrn ,:order_placed_date,:created_by, :modified_by);";
	public Integer insertOrder(Order order,Integer wolfId) {
		KeyHolder key = new GeneratedKeyHolder();
		Map<String,Object> parameters = new HashMap<String,Object>();
		parameters.put("wolf_cart_id", order.getCartId());
		parameters.put("wolf_id", wolfId);
		parameters.put("wolf_order_status_cd", order.getStatus().O.toString());
		parameters.put("created_by", "system");
		parameters.put("modified_by", "system");
		parameters.put("wolf_order_hwrn", order.getOrderHwrn());
		parameters.put("order_placed_date",Timestamp.from(order.getOrderPlacedDate().toInstant()));
		namedParameterJdbcTemplate.update(INSERT_NEW_ORDER,new MapSqlParameterSource(parameters),key, new String[]{ "wolf_order_id" });
		return key.getKey().intValue();
	}
	
	private static String INSERT_NEW_ORDER_ITEM = "INSERT INTO public.wolf_order_item " + 
			"	( wolf_order_id, quantity, order_item_price, wolf_cart_item_id, created_date, created_by, modified_date, modified_by, "
			+ "wolf_order_item_hwrn, chef_id, scheduled_delivery_date , actual_delivery_date,delivery_method) "
			+ "VALUES ( :wolf_order_id, :quantity, :order_item_price, :wolf_cart_item_id, NOW(), :created_by, NOW(), :modified_by, "
			+ ":wolf_order_item_hwrn, :chef_id, :scheduled_delivery_date, :actual_delivery_date,:delivery_method);";
	public Integer insertOrderItem(OrderItems orderItem,Order order) {
		KeyHolder key = new GeneratedKeyHolder();
		Map<String,Object> parameters = new HashMap<String,Object>();
		parameters.put("wolf_order_id", order.getId());
		parameters.put("quantity", order.getWolfId());
		parameters.put("order_item_price", OrderUtils.calcOrderItemPricing(orderItem.getMealDetails())); 
		parameters.put("wolf_cart_item_id", orderItem.getCartItemId());
		parameters.put("created_by", "system");
		parameters.put("modified_by", "system");
		parameters.put("wolf_order_item_hwrn", orderItem.getOrderItemHWRN());
		parameters.put("quantity", orderItem.getQuantity());
		parameters.put("chef_id", orderItem.getChefId());
		parameters.put("scheduled_delivery_date", Timestamp.from(orderItem.getScheduleDeliveryDate().toInstant()));
		parameters.put("actual_delivery_date", null);
		parameters.put("delivery_method", DeliveryMethodEnum.P.toString());
		namedParameterJdbcTemplate.update(INSERT_NEW_ORDER_ITEM, new MapSqlParameterSource(parameters),key,new String[]{ "wolf_order_item_id" });
		return key.getKey().intValue();
	}

}
