package com.hungrywolf.service.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungrywolf.base.db.repository.RatingRepository;
import com.hungrywolf.facts.model.generated.ChefRating;
import com.hungrywolf.facts.model.generated.ChefRatingDetails;

@Service
public class ChefRatingService {
	
	@Autowired
	public RatingRepository ratingRepository;
	
	public ChefRating  getChefRating(Integer chefId) {
		ChefRating customerRating = new ChefRating();
		
		return customerRating;
	}
	
	public ChefRatingDetails getChefRatingDetails(Integer chefId) {
		ChefRatingDetails customerRating = ratingRepository.getChefRatingDetails(chefId, null);
		return customerRating;
	}

}
