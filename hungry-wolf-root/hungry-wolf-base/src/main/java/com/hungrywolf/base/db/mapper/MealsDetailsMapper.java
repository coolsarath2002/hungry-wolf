package com.hungrywolf.base.db.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hungrywolf.base.db.repository.MealTagRepository;
import com.hungrywolf.facts.model.generated.Meal;
import com.hungrywolf.facts.model.generated.MealDetails;
import com.hungrywolf.facts.model.generated.MealSummary;
import com.hungrywolf.facts.model.generated.MealTags;
@Component
public class MealsDetailsMapper implements RowMapper<MealDetails>{

	@Autowired
	private MealTagRepository mealTagRepository;
	public MealsDetailsMapper() {
	
		
	}
	@Override
	public MealDetails mapRow(ResultSet rs, int arg1) throws SQLException {
		MealDetails mealDetail = new MealDetails();
		Meal meal = new Meal();
		meal.setId(rs.getInt("meal_id"));
		//meal.setMealDate(rs.getTimestamp("meal_date") != null ? rs.getTimestamp("meal_date").toInstant().atZone(TIME_ZONE) : null);
		meal.setTitle(rs.getString("title"));
		//meal.setChef(rs.getString("chef_id"));
		MealTags mealTags = mealTagRepository.getMealTags(rs.getInt("meal_id"));
		meal.setTags(mealTags);
		
		MealSummary mealSummary = new MealSummary();
		
		mealDetail.setMealSummary(mealSummary);
		return mealDetail;
	}

}
