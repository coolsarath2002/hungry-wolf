package com.hungrywolf.service.feed;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.apache.poi.ss.formula.functions.Days360;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.base.db.helper.Utils;
import com.hungrywolf.base.db.repository.MealRepository;
import com.hungrywolf.facts.model.generated.Meal;
import com.hungrywolf.facts.model.generated.MealDetails;
import com.hungrywolf.facts.model.generated.MealServing;
import com.hungrywolf.facts.model.generated.Meals;
import com.hungrywolf.facts.model.generated.SearchCriteria;

@Service
public class MealService {
	
	@Autowired
	public MealRepository mealRepository;
	
	public Meals findMealsbyCriteria() {
		Meals meals = new Meals();
		List<Meal> mealList = mealRepository.getAvailableMeals();
		meals.mealList(mealList);
		return meals;	
	}

	public Meals findMealsByTag(SearchCriteria search) {
		Meals meals = new Meals();
		//remove the hash tag from the tag
		for (String t : search.getSearchBy()) {
				t = t.replace("#", "");
		}
		
		List<Meal> mealList = mealRepository.getMealsByTag(search.getSearchBy(),null);
		meals.mealList(mealList);
		return meals;
	}
	
	public Meals findMealsByChef(SearchCriteria search) {
		Meals meals = new Meals();
		List<Integer> chefIds = new ArrayList<Integer>();
		chefIds.addAll(search.getSearchBy().stream().map(Integer::valueOf).collect(Collectors.toList()));
		List<Meal> mealList = mealRepository.getMealsByChef(chefIds, null);
		meals.mealList(mealList);
		return meals;
	}

	public MealDetails getMealDetails(String mealId) {
		MealDetails mealDetails = mealRepository.getMealDetails(Integer.parseInt(mealId)) ;
		return mealDetails;
	}

	public Meal findMealById(Integer mealId) {
		mealRepository.getByMealsId(mealId);
		return null;
	}

	public boolean checkAvailability(@Valid MealDetails mealDetails, Integer quantity) {
		
		if(mealDetails ==null || (mealDetails!=null && mealDetails.getMealServing() == null)) {
			return false;
		}
		
		if(mealDetails.getMealServing().getAvailable()!=null && 
					mealDetails.getMealServing().getAvailable().intValue() > 0 &&
					quantity <= mealDetails.getMealServing().getAvailable().intValue()) {
				return true;
		}
		
		return false;
	}
	
	public void updateQuantity(@Valid MealDetails mealDetails, Integer quantity) {
		mealRepository.updateMealAvailability(mealDetails.getMealServing(), quantity);
		
	}
	
	public String calculateTimeLeft(@Valid MealServing mealServing) {
		return Utils.calculateRemainingHoursDays(mealServing.getOrderClosedBy(), ZonedDateTime.now());
	}
	
	public String calculateTimeLeftForDelivery(@Valid MealServing mealServing) {
		return Utils.calculateRemainingHoursDays(mealServing.getMealDate(), ZonedDateTime.now());
	}
	
	
	

}
