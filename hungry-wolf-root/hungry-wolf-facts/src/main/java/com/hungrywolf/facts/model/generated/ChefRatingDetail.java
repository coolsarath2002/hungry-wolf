package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChefRatingDetail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-05T02:01:17.900-08:00")

public class ChefRatingDetail   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mealId")
  private Integer mealId = null;

  @JsonProperty("rating")
  private BigDecimal rating = null;

  @JsonProperty("ratingFactorDesc")
  private String ratingFactorDesc = null;

  @JsonProperty("ratingCd")
  private String ratingCd = null;

  public ChefRatingDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ChefRatingDetail mealId(Integer mealId) {
    this.mealId = mealId;
    return this;
  }

  /**
   * Get mealId
   * @return mealId
  **/
  @ApiModelProperty(value = "")


  public Integer getMealId() {
    return mealId;
  }

  public void setMealId(Integer mealId) {
    this.mealId = mealId;
  }

  public ChefRatingDetail rating(BigDecimal rating) {
    this.rating = rating;
    return this;
  }

  /**
   * amount
   * @return rating
  **/
  @ApiModelProperty(example = "15.25", value = "amount")

  @Valid

  public BigDecimal getRating() {
    return rating;
  }

  public void setRating(BigDecimal rating) {
    this.rating = rating;
  }

  public ChefRatingDetail ratingFactorDesc(String ratingFactorDesc) {
    this.ratingFactorDesc = ratingFactorDesc;
    return this;
  }

  /**
   * Get ratingFactorDesc
   * @return ratingFactorDesc
  **/
  @ApiModelProperty(example = "Quantity", value = "")


  public String getRatingFactorDesc() {
    return ratingFactorDesc;
  }

  public void setRatingFactorDesc(String ratingFactorDesc) {
    this.ratingFactorDesc = ratingFactorDesc;
  }

  public ChefRatingDetail ratingCd(String ratingCd) {
    this.ratingCd = ratingCd;
    return this;
  }

  /**
   * Get ratingCd
   * @return ratingCd
  **/
  @ApiModelProperty(example = "QTY", value = "")


  public String getRatingCd() {
    return ratingCd;
  }

  public void setRatingCd(String ratingCd) {
    this.ratingCd = ratingCd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChefRatingDetail chefRatingDetail = (ChefRatingDetail) o;
    return Objects.equals(this.id, chefRatingDetail.id) &&
        Objects.equals(this.mealId, chefRatingDetail.mealId) &&
        Objects.equals(this.rating, chefRatingDetail.rating) &&
        Objects.equals(this.ratingFactorDesc, chefRatingDetail.ratingFactorDesc) &&
        Objects.equals(this.ratingCd, chefRatingDetail.ratingCd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mealId, rating, ratingFactorDesc, ratingCd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChefRatingDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mealId: ").append(toIndentedString(mealId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    ratingFactorDesc: ").append(toIndentedString(ratingFactorDesc)).append("\n");
    sb.append("    ratingCd: ").append(toIndentedString(ratingCd)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

