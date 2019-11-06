package com.hungrywolf.base.db.helper;

import java.time.Duration;
import java.time.ZonedDateTime;

public class Utils {
	
	public static String calculateRemainingHoursDays(ZonedDateTime deliveryDate,ZonedDateTime currentDate) {
    	StringBuffer message = new StringBuffer();
    	boolean isOverdue = false;
    	if( deliveryDate.isBefore(currentDate) ) {
    		message.append("Overdue ");
    		isOverdue = true;
    	}
    	if(deliveryDate!=null) {
    		Duration duration = Duration.between(deliveryDate, currentDate);
    		long diffInDays = Math.abs(duration.toDays());
    		long diffInHours = Math.abs(duration.toHours());
    		if(isOverdue) {
    			if(diffInHours < 24) {
        			message.append(diffInHours);
        			message.append(" hours");
        		}else if(diffInDays >= 1) {
        			message.append(diffInDays);
        			message.append(" Days");
        		}
    		}else {
	    		if(diffInHours < 24 && !isOverdue) {
	    			message.append(diffInHours);
	    			message.append(" hours left");
	    		}else if(diffInDays >= 1) {
	    			message.append(diffInDays);
	    			message.append(" Days left");
	    		}
    		}
    	}
    	
    	return message.toString();
    }

}
