package com.hungrywolf.service.feed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.base.db.repository.MealTagRepository;
import com.hungrywolf.facts.model.generated.MealTags;
@Service
public class MealTagService {
	
	@Autowired
	public MealTagRepository mealTagRepository;
	
	public MealTags getMealsTags(Integer mealId) {
		return mealTagRepository.getMealTags(mealId);
	}

}
