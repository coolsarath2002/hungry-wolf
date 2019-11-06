package com.hungrywolf.service.feed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.base.db.repository.MealPricingRepository;
import com.hungrywolf.facts.model.generated.PricingInfo;
import com.hungrywolf.facts.model.generated.PricingInfos;

@Service
public class MealPricingInfoService {
	
	@Autowired
	public MealPricingRepository mealPricingRepository;
	
	public PricingInfos getChefMealPricing(Integer mealId) {
		PricingInfos pricingInfo = new PricingInfos();
		pricingInfo.pricingType("uewpcdcd");
		pricingInfo.pricingInfo(mealPricingRepository.getChefMealPricing(mealId));
		return pricingInfo;
	}
	
	public PricingInfos getWolfMealPricing(Integer mealId) {
		PricingInfos pricingInfo = new PricingInfos();
		pricingInfo.pricingType("qweqwer");
		pricingInfo.pricingInfo(mealPricingRepository.getWolfMealPricing(mealId));
		return pricingInfo;
	}

}
