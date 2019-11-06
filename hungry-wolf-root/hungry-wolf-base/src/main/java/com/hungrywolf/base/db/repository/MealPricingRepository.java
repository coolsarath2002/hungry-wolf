package com.hungrywolf.base.db.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hungrywolf.facts.model.generated.MealTags;
import com.hungrywolf.facts.model.generated.PricingInfo;

@Repository
public class MealPricingRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public static String GET_MEAL_CHEF_PRICING_BY_MEALID = "select prc.chef_meal_pricing_id,prc.rate_type,prc.rate, prc.rate_type ,prcLookup.rate_desc, prcLookup.fees," +
			" prcLookup.rate_group ,prc.currency_id,currLookup.currency_cd,prc.pricing_rate_cd,prc.rate from public.chef_meal_pricing prc " + 
			" join public.pricing_rate_lookup prcLookup on prcLookup.pricing_rate_id = prc.pricing_rate_cd " + 
			" join public.currency_lookup currLookup on currLookup.currency_id = prc.currency_id " + 
			" where prc.meal_id = :mealId and prcLookup.valid = true" ;
	 
	 public List<PricingInfo> getChefMealPricing(Integer mealId) {
		 Map<String, Object> parameters = new HashMap<>();
		 parameters.put("mealId", mealId);
		 
		 return namedParameterJdbcTemplate.query(GET_MEAL_CHEF_PRICING_BY_MEALID, parameters,  (rs, rowNum) -> {
			PricingInfo pricingInfo = new PricingInfo();
			
			pricingInfo.id(rs.getInt("chef_meal_pricing_id"))
			.currency(rs.getString("currency_cd"))
			.rateCd(rs.getString("pricing_rate_cd"))
			.rate(rs.getBigDecimal("rate"))
			.rateType(rs.getString("rate_type"));
			
			return pricingInfo;
		 });
	}
	 
	 
	 public static String GET_MEAL_WOLF_PRICING_BY_MEALID = "select prc.wolf_meal_pricing_id,prc.rate_type,prc.rate, prc.rate_type ,prcLookup.rate_desc,prcLookup.fees, "+
			" prcLookup.rate_group ,prc.currency_id,currLookup.currency_cd,prc.pricing_rate_cd,prc.rate from public.wolf_meal_pricing prc " + 
	 		" join public.pricing_rate_lookup prcLookup on prcLookup.pricing_rate_id = prc.pricing_rate_cd " + 
	 		" join public.currency_lookup currLookup on currLookup.currency_id = prc.currency_id " + 
	 		" where prc.meal_id = 1 and prcLookup.valid = true" ;
		 
		 public List<PricingInfo> getWolfMealPricing(Integer mealId) {
			 Map<String, Object> parameters = new HashMap<>();
			 parameters.put("mealId", mealId);
			 
			 return namedParameterJdbcTemplate.query(GET_MEAL_WOLF_PRICING_BY_MEALID, parameters,  (rs, rowNum) -> {
				PricingInfo pricingInfo = new PricingInfo();
				
				pricingInfo.id(rs.getInt("wolf_meal_pricing_id"))
				.currency(rs.getString("currency_cd"))
				.rateCd(rs.getString("pricing_rate_cd"))
				.rate(rs.getBigDecimal("rate"))
				.rateType(rs.getString("rate_type"));
				
				return pricingInfo;
			 });
		}

}
