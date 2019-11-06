package com.hungrywolf.service.data.loader;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.base.db.MongoDBRetriever;
import com.hungrywolf.facts.model.generated.Creator;
import com.hungrywolf.facts.model.generated.Meal;
import com.hungrywolf.facts.model.generated.MealDelivery;
import com.hungrywolf.facts.model.generated.MealItems;
import com.hungrywolf.facts.model.generated.MealServing;
import com.hungrywolf.facts.model.generated.MealSummary;
import com.hungrywolf.facts.model.generated.MealTags;
import com.hungrywolf.facts.model.generated.PricingInfo;
import com.hungrywolf.facts.model.generated.PricingInfos;
import com.hungrywolf.facts.model.generated.Rating;
import com.hungrywolf.facts.model.generated.RatingDetails;
import com.hungrywolf.service.feed.MealService;

@Service
public class MealBulkLoader {

	private static Random rndm=new Random();
	 public static final ZoneId TIME_ZONE = ZoneId.of("America/New_York");
	 
	@Autowired
	 public MealService mealsService;
	
	/*
	public Meal createMealsDetails() {
		Meal meal = new Meal();
		Creator creator= new Creator();
		creator.setAvatar("imgUrl");
		creator.setRating(new Rating().
				detail(new RatingDetails()
						.delivery(new BigDecimal(4))
						.packing(new BigDecimal(4))
						.quality(new BigDecimal(3.5))
						.quantity(new BigDecimal(4))
						.taste(new BigDecimal(3))
						.misc(new BigDecimal(3.5)
				)).overall(new BigDecimal(4.5)));
		
		creator = mealsService.addCreator(creator);
		
		meal.setChef(creator.getId());
		meal.setMealDate(ZonedDateTime.now());
		String cuisine = MetaDataRandomizer.getCuisine();
		String region = MetaDataRandomizer.getRegion().getValue();
		Set<String> tags =  MetaDataRandomizer.getWords(5, cuisine, region);
		meal.setTags(new MealTags().tags(new ArrayList(tags)));
		
		meal = mealsService.addMeal(meal);
		
		MealServing serving = 
				new MealServing()
				.mealId(meal.getId())
				.available(new BigDecimal(5))
				.mealDate(ZonedDateTime.now(TIME_ZONE))
				.orderClosedBy(meal.getMealDate().minusHours(4))
				.timeLeft(meal.getMealDate().plusHours(4));
		
		mealsService.addMealServing(serving);
		
		MealSummary mealSummary = new MealSummary()
						.mealId(meal.getId());
		
		if(tags!=null)
		{
			tags.forEach(menu -> {
				boolean isMainCourse = MetaDataRandomizer.isMainCourse();
				mealSummary.addItemsItem(new MealItems()
						.desc(MessageFormat.format("Desc for the item is {0}", menu))
						.dishType(isMainCourse ? "main course" : "side")
						.measurement(isMainCourse ? "300g" : "15g"));
			});
		}
		
		mealsService.addMealSummary(mealSummary);
		
		MealDelivery delivery = new MealDelivery()
							.mealId(meal.getId())
							.deliveryType("In person")
							.mealDate(ZonedDateTime.now(TIME_ZONE));
		
		mealsService.addMealDelivery(delivery);
		PricingInfos pricing = new PricingInfos()
								.mealId(meal.getId())
								.addPricingInfoItem(new PricingInfo()
										.currency("Dollar")
										.rate(new BigDecimal(50))
										.rateCd("hwcooking")
										.rateType("c")
										);
			
		mealsService.addPricingInfos(pricing);
		//meal.setTags(tags);
		meal.setMealHeader("rndm" + rndm.toString());
		meal.setAdditionalInfo("Add more rice, extra gravy");
		meal.setCreatedDate(ZonedDateTime.of(LocalDateTime.MIN.plusSeconds(rndm.nextLong()), TIME_ZONE));
		meal.setEstimatedDelivery(ZonedDateTime.of(LocalDateTime.MIN.plusSeconds(rndm.nextLong()), TIME_ZONE));
		meal.setCurrencyEquivalent(new BigDecimal(60));
		meal.setMealsAvailable("5");
		meal.setMealsLeft("5");
		meal.setOrderClosedBy(ZonedDateTime.of(LocalDateTime.MIN.plusSeconds(rndm.nextLong()), TIME_ZONE));
		meal.setPickupInfo("this is a test pick up location");
		meal.setSource("app");
		meal.setSummary("South indian breakfast");
		meal.setTags("South indian");
		
		
		
		//AdsDetailsQueryServiceImpl adsQService = new AdsDetailsQueryServiceImpl();
		//adsQService.insert(ads);
		return meal;
	}*/
	
	
}
