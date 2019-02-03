package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Meal
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-02T14:29:23.639-08:00")

public class Meal   {
  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("orderClosedBy")
  private ZonedDateTime orderClosedBy = null;

  @JsonProperty("createdDate")
  private ZonedDateTime createdDate = null;

  @JsonProperty("currencyEquivalent")
  private BigDecimal currencyEquivalent = null;

  @JsonProperty("meal_header")
  private String mealHeader = null;

  @JsonProperty("estimatedDelivery")
  private ZonedDateTime estimatedDelivery = null;

  @JsonProperty("tags")
  private String tags = null;

  @JsonProperty("mealsLeft")
  private String mealsLeft = null;

  @JsonProperty("mealsAvailable")
  private String mealsAvailable = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("pickup_info")
  private String pickupInfo = null;

  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  public Meal summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Meal token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Meal orderClosedBy(ZonedDateTime orderClosedBy) {
    this.orderClosedBy = orderClosedBy;
    return this;
  }

  /**
   * Get orderClosedBy
   * @return orderClosedBy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getOrderClosedBy() {
    return orderClosedBy;
  }

  public void setOrderClosedBy(ZonedDateTime orderClosedBy) {
    this.orderClosedBy = orderClosedBy;
  }

  public Meal createdDate(ZonedDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(ZonedDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Meal currencyEquivalent(BigDecimal currencyEquivalent) {
    this.currencyEquivalent = currencyEquivalent;
    return this;
  }

  /**
   * Get currencyEquivalent
   * @return currencyEquivalent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCurrencyEquivalent() {
    return currencyEquivalent;
  }

  public void setCurrencyEquivalent(BigDecimal currencyEquivalent) {
    this.currencyEquivalent = currencyEquivalent;
  }

  public Meal mealHeader(String mealHeader) {
    this.mealHeader = mealHeader;
    return this;
  }

  /**
   * Get mealHeader
   * @return mealHeader
  **/
  @ApiModelProperty(value = "")


  public String getMealHeader() {
    return mealHeader;
  }

  public void setMealHeader(String mealHeader) {
    this.mealHeader = mealHeader;
  }

  public Meal estimatedDelivery(ZonedDateTime estimatedDelivery) {
    this.estimatedDelivery = estimatedDelivery;
    return this;
  }

  /**
   * Get estimatedDelivery
   * @return estimatedDelivery
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getEstimatedDelivery() {
    return estimatedDelivery;
  }

  public void setEstimatedDelivery(ZonedDateTime estimatedDelivery) {
    this.estimatedDelivery = estimatedDelivery;
  }

  public Meal tags(String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")


  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public Meal mealsLeft(String mealsLeft) {
    this.mealsLeft = mealsLeft;
    return this;
  }

  /**
   * Get mealsLeft
   * @return mealsLeft
  **/
  @ApiModelProperty(value = "")


  public String getMealsLeft() {
    return mealsLeft;
  }

  public void setMealsLeft(String mealsLeft) {
    this.mealsLeft = mealsLeft;
  }

  public Meal mealsAvailable(String mealsAvailable) {
    this.mealsAvailable = mealsAvailable;
    return this;
  }

  /**
   * Get mealsAvailable
   * @return mealsAvailable
  **/
  @ApiModelProperty(value = "")


  public String getMealsAvailable() {
    return mealsAvailable;
  }

  public void setMealsAvailable(String mealsAvailable) {
    this.mealsAvailable = mealsAvailable;
  }

  public Meal source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Meal pickupInfo(String pickupInfo) {
    this.pickupInfo = pickupInfo;
    return this;
  }

  /**
   * Get pickupInfo
   * @return pickupInfo
  **/
  @ApiModelProperty(value = "")


  public String getPickupInfo() {
    return pickupInfo;
  }

  public void setPickupInfo(String pickupInfo) {
    this.pickupInfo = pickupInfo;
  }

  public Meal additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "")


  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meal meal = (Meal) o;
    return Objects.equals(this.summary, meal.summary) &&
        Objects.equals(this.token, meal.token) &&
        Objects.equals(this.orderClosedBy, meal.orderClosedBy) &&
        Objects.equals(this.createdDate, meal.createdDate) &&
        Objects.equals(this.currencyEquivalent, meal.currencyEquivalent) &&
        Objects.equals(this.mealHeader, meal.mealHeader) &&
        Objects.equals(this.estimatedDelivery, meal.estimatedDelivery) &&
        Objects.equals(this.tags, meal.tags) &&
        Objects.equals(this.mealsLeft, meal.mealsLeft) &&
        Objects.equals(this.mealsAvailable, meal.mealsAvailable) &&
        Objects.equals(this.source, meal.source) &&
        Objects.equals(this.pickupInfo, meal.pickupInfo) &&
        Objects.equals(this.additionalInfo, meal.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, token, orderClosedBy, createdDate, currencyEquivalent, mealHeader, estimatedDelivery, tags, mealsLeft, mealsAvailable, source, pickupInfo, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meal {\n");
    
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    orderClosedBy: ").append(toIndentedString(orderClosedBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    currencyEquivalent: ").append(toIndentedString(currencyEquivalent)).append("\n");
    sb.append("    mealHeader: ").append(toIndentedString(mealHeader)).append("\n");
    sb.append("    estimatedDelivery: ").append(toIndentedString(estimatedDelivery)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    mealsLeft: ").append(toIndentedString(mealsLeft)).append("\n");
    sb.append("    mealsAvailable: ").append(toIndentedString(mealsAvailable)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    pickupInfo: ").append(toIndentedString(pickupInfo)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

