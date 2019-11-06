package com.hungrywolf.base.db.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hungrywolf.facts.model.generated.MealItems;
import com.hungrywolf.facts.model.generated.MealTags;
@Repository 
public class MealItemRepository {
	
	@Autowired
	 private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public static String GET_MENUITEM_BY_MEALID = "select m.meal_id,item.item_desc,item.meal_item_id,itmType.meal_item_cd,itmType.meal_item_desc,msr.meal_measurement_id, " + 
			" msr.measurement_desc,item.measurement_val from public.meals m " + 
			" join public.meal_item item on item.meal_id = m.meal_id " + 
			" join public.meal_item_type itmType on itmType.meal_item_type_id = item.item_type_id " + 
			" join public.meal_measurement_type msr on msr.meal_measurement_id = item.measurement_type_id " + 
			" where m.meal_id = :mealId";
	 
	 public List<MealItems> getMealItems(Integer mealId) {
		 Map<String, Object> parameters = new HashMap<>();
		 parameters.put("mealId", mealId);
		 MealTags mealTags = new MealTags();
		 List<MealItems> result = namedParameterJdbcTemplate.query(GET_MENUITEM_BY_MEALID, parameters,  (rs, rowNum) -> {
			 	MealItems mealItems = new MealItems();
				mealItems.setDesc(rs.getString("item_desc"));
				mealItems.setItemId(rs.getInt("meal_item_id"));
				mealItems.setDishType(rs.getString("meal_item_desc"));
				mealItems.setMealId(rs.getInt("meal_id"));
				mealItems.setMeasurement(rs.getString("measurement_desc"));
				return mealItems;
		 });
		 
		 return result;
	 }

}
