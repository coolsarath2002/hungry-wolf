package com.hungrywolf.base.db.helper;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;

import com.hungrywolf.facts.model.generated.MealDetails;
import com.hungrywolf.facts.model.generated.PricingInfo;

public class OrderUtils {
	
	public static String ORDER_HWRN_FORMAT = "{0}-O{1}";
	public static String ORDER_ITEM_HWRN_FORMAT = "{0}-{2}";
	
	public static String buildOrderHWRN(String wolfId,String orderNumber) {
		String OrderHwrn = MessageFormat.format(ORDER_HWRN_FORMAT, wolfId,orderNumber);
		return OrderHwrn;
	}

	public static String buildOrderItemHWRN(String orderNumber,String orderItemSeq) {
		String OrderItemHwrn = MessageFormat.format(ORDER_ITEM_HWRN_FORMAT, orderNumber,orderItemSeq);
		return OrderItemHwrn;
	}
	
	public static BigDecimal calcOrderItemPricing(MealDetails mealDetail) {
		BigDecimal total = BigDecimal.ZERO.setScale(2, RoundingMode.UP);;
		if(mealDetail.getPricing()!=null && mealDetail.getPricing().getPricingInfo()!=null && 
				mealDetail.getPricing().getPricingInfo().size() >0 ) {
			for(PricingInfo pricing: mealDetail.getPricing().getPricingInfo()) {
				total.add(pricing.getRate());
			}
		}
	return total;
	}
}
