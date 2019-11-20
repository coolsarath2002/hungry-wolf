package com.hungrywolf.base.db.repository;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hungrywolf.base.db.helper.Utils;
import com.hungrywolf.base.db.mapper.MealsDetailsMapper;
import com.hungrywolf.base.db.mapper.MealsMapper;
import com.hungrywolf.facts.model.generated.Meal;
import com.hungrywolf.facts.model.generated.MealDetails;
import com.hungrywolf.facts.model.generated.MealItems;
import com.hungrywolf.facts.model.generated.MealServing;
import com.hungrywolf.facts.model.generated.MealSummary;
import com.hungrywolf.facts.model.generated.MealTags;
import com.hungrywolf.facts.model.generated.Meals;
import com.hungrywolf.facts.model.generated.PricingInfos;

@Repository
public class MealRepository {

	
	 @Autowired
	 private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	 
	 @Autowired
	 private MealsMapper mealsMapper;
	 
	 @Autowired
	 private MealsDetailsMapper mealDetailsMapper;
	 
	 @Autowired
	 private MealTagRepository mealTagRepository;
	 
	 @Autowired
	 private MealItemRepository mealItemRepository;
	 
	 @Autowired
	 private MealPricingRepository mealPricingRepository;
	 
	 
	 public static final ZoneId TIME_ZONE = ZoneId.systemDefault();	
	 
	public static String GET_AVAILABLE_MEALS = "select m.meal_id, m.title, m.meal_date, m.chef_id,summ.notes,summ.notes_created_date,serv.meal_date,serv.available, " + 
			" serv.order_closed_by from public.meals m " + 
			" join public.meal_summary summ on summ.meal_id = m.meal_id " + 
			" join public.meal_serving serv on serv.meal_id = m.meal_id ";
	
	public List<Meal> getAvailableMeals() {
		Map<String, Object> parameters = new HashMap<>();
		return namedParameterJdbcTemplate.query(GET_AVAILABLE_MEALS, parameters, mealsMapper);
	}
	
	public static String GET_AVAILABLE_MEALS_BY_TAG = "select m.meal_id, m.title, m.meal_date, m.chef_id,summ.notes,summ.notes_created_date,serv.meal_date,serv.available, " + 
			"serv.order_closed_by from public.meals m " + 
			"join public.meal_summary summ on summ.meal_id = m.meal_id " + 
			"join public.meal_serving serv on serv.meal_id = m.meal_id " + 
			"join public.meal_tags tags on tags.meal_id = m.meal_id " + 
			"where tags.tag IN (:tags)";
	
	public List<Meal> getMealsByTag(List<String> tags, String sortingOrder){
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("tags", tags);
		return namedParameterJdbcTemplate.query(GET_AVAILABLE_MEALS_BY_TAG, parameters, mealsMapper);
	}
	
	public static String GET_AVAILABLE_MEALS_BY_CHEF = "select m.meal_id, m.title, m.meal_date, m.chef_id,summ.notes,summ.notes_created_date,serv.meal_date,serv.available, " + 
			"serv.order_closed_by from public.meals m " + 
			"join public.meal_summary summ on summ.meal_id = m.meal_id " + 
			"join public.meal_serving serv on serv.meal_id = m.meal_id " + 
			"where m.chef_id IN (:chefs)";
	
	public List<Meal> getMealsByChef(List<Integer> chefs, String sortingOrder){
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("chefs", chefs);
		return namedParameterJdbcTemplate.query(GET_AVAILABLE_MEALS_BY_CHEF, parameters, mealsMapper);
	}
	
	
	public static String GET_MEAL_DETAILS_BY_ID = "select m.meal_id, m.title, m.meal_date, m.chef_id,summ.notes,summ.notes_created_date,serv.meal_date,serv.available, " + 
			"serv.order_closed_by,serv.scheduled_delivery_date from public.meals m " + 
			"join public.meal_summary summ on summ.meal_id = m.meal_id " + 
			"join public.meal_serving serv on serv.meal_id = m.meal_id " + 
			"where m.meal_id = :mealId";
	
	public MealDetails getMealDetails(Integer mealId) {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("mealId", mealId);
		MealSummary mealSummary = new MealSummary();
		MealDetails mealDetail = new MealDetails();
		MealServing mealServing = new MealServing();
		return namedParameterJdbcTemplate.queryForObject(GET_MEAL_DETAILS_BY_ID, parameters, (rs, rowNum) -> {
			
			Meal meal = new Meal();
			meal.setId(rs.getInt("meal_id"));
			meal.setMealDate(rs.getTimestamp("meal_date") != null ? rs.getTimestamp("meal_date").toInstant().atZone(TIME_ZONE) : null);
			meal.setTitle(rs.getString("title"));
			//meal.setChef(rs.getString("chef_id"));
			MealTags mealTags = mealTagRepository.getMealTags(rs.getInt("meal_id"));
			meal.setTags(mealTags);
			mealSummary.setItems(mealItemRepository.getMealItems(mealId));
			//Meal serving
			mealServing.mealId(rs.getInt("meal_id"));
			mealServing.available(rs.getBigDecimal("available"))
			.orderClosedBy(rs.getTimestamp("order_closed_by") != null ? rs.getTimestamp("order_closed_by").toInstant().atZone(TIME_ZONE) : null)
			.scheduledDeliveryDate(rs.getTimestamp("scheduled_delivery_date") != null ? rs.getTimestamp("scheduled_delivery_date").toInstant().atZone(TIME_ZONE) : null)
			. mealDate(rs.getTimestamp("meal_date") != null ? rs.getTimestamp("meal_date").toInstant().atZone(TIME_ZONE) : null);
			String timeleft= Utils.calculateRemainingHoursDays(mealServing.getOrderClosedBy(), ZonedDateTime.now());
			mealServing.setTimeLeft(timeleft);
			PricingInfos pricingInfos = new PricingInfos();
			pricingInfos.pricingInfo(mealPricingRepository.getWolfMealPricing(mealId));
			
			mealDetail.meal(meal)
			.mealServing(mealServing)
			.mealSummary(mealSummary)
			.pricing(pricingInfos);
			
			
			mealDetail.setMealSummary(mealSummary);
			return mealDetail;
		 });
		
	}

	public static String GET_MEAL_BY_ID = "select m.meal_id, m.title, m.meal_date, m.chef_id,summ.notes,summ.notes_created_date,serv.meal_date,serv.available, " + 
			" serv.order_closed_by from public.meals m " + 
			" join public.meal_summary summ on summ.meal_id = m.meal_id " + 
			" join public.meal_serving serv on serv.meal_id = m.meal_id " +
			" where m.mealId = :mealId";
	
	public Meal getByMealsId(Integer mealId) {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("mealId", mealId);
		return namedParameterJdbcTemplate.queryForObject(GET_MEAL_BY_ID, parameters, mealsMapper);
	}
	
	
	
	public static String UPDATE_AVAILABLE_MEALS_QUANTITY = "update public.meal_serving set available = :quantity where meal_id = :mealId"; 
			
	public void updateMealAvailability(MealServing mealServing , Integer quantity) {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("mealId", mealServing.getMealId());
		parameters.put("quantity",  mealServing.getAvailable().intValue() - quantity.intValue());
		namedParameterJdbcTemplate.update(UPDATE_AVAILABLE_MEALS_QUANTITY, parameters);
	}
	
}

