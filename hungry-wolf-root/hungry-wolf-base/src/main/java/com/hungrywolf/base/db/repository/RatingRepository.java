package com.hungrywolf.base.db.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hungrywolf.facts.model.generated.ChefRating;
import com.hungrywolf.facts.model.generated.ChefRatingDetail;
import com.hungrywolf.facts.model.generated.ChefRatingDetails;

@Repository
public class RatingRepository {

	@Autowired
	 private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public static String GET_RATING_BY_CHEFID = "select chRating.chef_rating_id,chRating.chef_id,chRating.overall_rating\n" + 
			" from public.chef_rating chRating where chef_id = :chefId";
	 
	 public ChefRating getChefRating(Integer chefId) {
		 Map<String, Object> parameters = new HashMap<>();
		 parameters.put("chefId", chefId);
		 
		 ChefRating result = namedParameterJdbcTemplate.queryForObject(GET_RATING_BY_CHEFID, parameters,  (rs, rowNum) -> {
			 ChefRating rating = new ChefRating();
			 rating.id(rs.getInt("chef_rating_id"))
			 .overall(rs.getBigDecimal("overall_rating"));
			 
			return rating;
		 });
		 
		 return result;
	 }
	 
	 
	 public static String GET_RATING_DETAILS_BY_CHEFID =  "select ratingDet.chef_rating_id,ratingFac.rating_factor_cd," + 
	 		" ratingFac.rating_factor_desc,ratingDet.rating_val from public.chef_rating chRating " + 
	 		" join public.chef_rating_detail ratingDet on chRating.chef_rating_id = ratingDet.chef_rating_id " + 
	 		" join public.chef_rating_factor ratingFac on ratingFac.chef_rating_factor_id = ratingDet.rating_factor_id " + 
	 		" where chRating.chef_id= :chefId";
		 
		 public ChefRatingDetails getChefRatingDetails(Integer chefId, List<Integer> mealIds) {
			 Map<String, Object> parameters = new HashMap<>();
			 parameters.put("chefId", chefId);
			 ChefRatingDetails ratingDetails = new ChefRatingDetails();
			 List<ChefRatingDetail> ratings =  namedParameterJdbcTemplate.query(GET_RATING_DETAILS_BY_CHEFID, parameters,  (rs, rowNum) -> {
				 ChefRatingDetail rating = new ChefRatingDetail();
				 rating.id(rs.getInt("chef_rating_id"))
				 .ratingCd(rs.getString("rating_factor_cd"))
				 .ratingFactorDesc(rs.getString("rating_factor_desc"))
				 .rating(rs.getBigDecimal("rating_val"));
				 
				return rating;
			 });
			 ratingDetails.setItems(ratings);
			 return ratingDetails;
		 }
}
