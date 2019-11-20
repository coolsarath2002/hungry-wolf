package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MealServing
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class MealServing   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mealId")
  private Integer mealId = null;

  @JsonProperty("available")
  private BigDecimal available = null;

  @JsonProperty("timeLeft")
  private String timeLeft = null;

  @JsonProperty("mealDate")
  private ZonedDateTime mealDate = null;

  @JsonProperty("orderClosedBy")
  private ZonedDateTime orderClosedBy = null;
  
  @JsonProperty("scheduledDeliveryDate")
  private ZonedDateTime scheduledDeliveryDate = null;

  public MealServing id(Integer id) {
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

  public MealServing mealId(Integer mealId) {
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

  public MealServing available(BigDecimal available) {
    this.available = available;
    return this;
  }

  /**
   * amount
   * @return available
  **/
  @ApiModelProperty(example = "15.25", value = "amount")

  @Valid

  public BigDecimal getAvailable() {
    return available;
  }

  public void setAvailable(BigDecimal available) {
    this.available = available;
  }

  public MealServing timeLeft(String timeLeft) {
    this.timeLeft = timeLeft;
    return this;
  }

  /**
   * time in mins
   * @return timeLeft
  **/
  @ApiModelProperty(example = "15.25", value = "time in mins")


  public String getTimeLeft() {
    return timeLeft;
  }

  public void setTimeLeft(String timeLeft) {
    this.timeLeft = timeLeft;
  }

  public MealServing mealDate(ZonedDateTime mealDate) {
    this.mealDate = mealDate;
    return this;
  }

  /**
   * Meal Order deadline Date
   * @return mealDate
  **/
  @ApiModelProperty(example = "2018-06-22T00:00:00.000+0000", value = "Meal Order deadline Date")

  @Valid

  public ZonedDateTime getMealDate() {
    return mealDate;
  }

  public void setMealDate(ZonedDateTime mealDate) {
    this.mealDate = mealDate;
  }

  public MealServing orderClosedBy(ZonedDateTime orderClosedBy) {
    this.orderClosedBy = orderClosedBy;
    return this;
  }

  /**
   * Meal Order deadline Date
   * @return orderClosedBy
  **/
  @ApiModelProperty(example = "2018-06-22T00:00:00.000+0000", value = "Meal Order deadline Date")

  @Valid

  public ZonedDateTime getOrderClosedBy() {
    return orderClosedBy;
  }

  public void setOrderClosedBy(ZonedDateTime orderClosedBy) {
    this.orderClosedBy = orderClosedBy;
  }


  public MealServing scheduledDeliveryDate(ZonedDateTime scheduledDeliveryDate) {
	    this.scheduledDeliveryDate = scheduledDeliveryDate;
	    return this;
	  }

	  /**
	   * Meal Order deadline Date
	   * @return orderClosedBy
	  **/
	  @ApiModelProperty(example = "2018-06-22T00:00:00.000+0000", value = "Meal Order deadline Date")

	  @Valid

	  public ZonedDateTime getScheduledDeliveryDate() {
	    return scheduledDeliveryDate;
	  }

	  public void setScheduledDeliveryDate(ZonedDateTime scheduledDeliveryDate) {
	    this.scheduledDeliveryDate = scheduledDeliveryDate;
	  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MealServing mealServing = (MealServing) o;
    return Objects.equals(this.id, mealServing.id) &&
        Objects.equals(this.mealId, mealServing.mealId) &&
        Objects.equals(this.available, mealServing.available) &&
        Objects.equals(this.timeLeft, mealServing.timeLeft) &&
        Objects.equals(this.mealDate, mealServing.mealDate) &&
        Objects.equals(this.orderClosedBy, mealServing.orderClosedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mealId, available, timeLeft, mealDate, orderClosedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MealServing {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mealId: ").append(toIndentedString(mealId)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    timeLeft: ").append(toIndentedString(timeLeft)).append("\n");
    sb.append("    mealDate: ").append(toIndentedString(mealDate)).append("\n");
    sb.append("    orderClosedBy: ").append(toIndentedString(orderClosedBy)).append("\n");
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

