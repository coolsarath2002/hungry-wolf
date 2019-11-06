package com.hungrywolf.base.db.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hungrywolf.facts.model.generated.MealTags;

@Repository
public class MealTagRepository {

	@Autowired
	 private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public static String GET_TAGS_BY_MEALID = "select m.meal_id, tags.meal_tag_id,tags.tag from public.meals m " + 
			"join public.meal_tags tags on tags.meal_id = m.meal_id where m.meal_id=:mealId ";
	 
	 public MealTags getMealTags(Integer mealId) {
		 Map<String, Object> parameters = new HashMap<>();
		 parameters.put("mealId", mealId);
		 MealTags mealTags = new MealTags();
		 List<String> result = namedParameterJdbcTemplate.query(GET_TAGS_BY_MEALID, parameters,  (rs, rowNum) -> {
			 StringBuffer tag = new StringBuffer("#");
			 tag.append(rs.getString("tag"));
			 mealTags.setMealId(rs.getInt("meal_id"));
			 mealTags.addTagsItem(tag.toString());
			 return tag.toString();
		 });
		 
		 return mealTags;
	 }
	
}
