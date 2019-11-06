package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MealDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class MealDetails   {
  @JsonProperty("meal")
  private Meal meal = null;

  @JsonProperty("mealSummary")
  private MealSummary mealSummary = null;

  @JsonProperty("mealServing")
  private MealServing mealServing = null;

  @JsonProperty("mealDelivery")
  private MealDelivery mealDelivery = null;

  @JsonProperty("pricing")
  private PricingInfos pricing = null;

  public MealDetails meal(Meal meal) {
    this.meal = meal;
    return this;
  }

  /**
   * Get meal
   * @return meal
  **/
  @ApiModelProperty(value = "")


  public Meal getMeal() {
    return meal;
  }

  public void setMeal(Meal meal) {
    this.meal = meal;
  }

  public MealDetails mealSummary(MealSummary mealSummary) {
    this.mealSummary = mealSummary;
    return this;
  }

  /**
   * Get mealSummary
   * @return mealSummary
  **/
  @ApiModelProperty(value = "")


  public MealSummary getMealSummary() {
    return mealSummary;
  }

  public void setMealSummary(MealSummary mealSummary) {
    this.mealSummary = mealSummary;
  }

  public MealDetails mealServing(MealServing mealServing) {
    this.mealServing = mealServing;
    return this;
  }

  /**
   * Get mealServing
   * @return mealServing
  **/
  @ApiModelProperty(value = "")


  public MealServing getMealServing() {
    return mealServing;
  }

  public void setMealServing(MealServing mealServing) {
    this.mealServing = mealServing;
  }

  public MealDetails mealDelivery(MealDelivery mealDelivery) {
    this.mealDelivery = mealDelivery;
    return this;
  }

  /**
   * Get mealDelivery
   * @return mealDelivery
  **/
  @ApiModelProperty(value = "")


  public MealDelivery getMealDelivery() {
    return mealDelivery;
  }

  public void setMealDelivery(MealDelivery mealDelivery) {
    this.mealDelivery = mealDelivery;
  }

  public MealDetails pricing(PricingInfos pricing) {
    this.pricing = pricing;
    return this;
  }

  /**
   * Get pricing
   * @return pricing
  **/
  @ApiModelProperty(value = "")


  public PricingInfos getPricing() {
    return pricing;
  }

  public void setPricing(PricingInfos pricing) {
    this.pricing = pricing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MealDetails mealDetails = (MealDetails) o;
    return Objects.equals(this.meal, mealDetails.meal) &&
        Objects.equals(this.mealSummary, mealDetails.mealSummary) &&
        Objects.equals(this.mealServing, mealDetails.mealServing) &&
        Objects.equals(this.mealDelivery, mealDetails.mealDelivery) &&
        Objects.equals(this.pricing, mealDetails.pricing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meal, mealSummary, mealServing, mealDelivery, pricing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MealDetails {\n");
    
    sb.append("    meal: ").append(toIndentedString(meal)).append("\n");
    sb.append("    mealSummary: ").append(toIndentedString(mealSummary)).append("\n");
    sb.append("    mealServing: ").append(toIndentedString(mealServing)).append("\n");
    sb.append("    mealDelivery: ").append(toIndentedString(mealDelivery)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
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

