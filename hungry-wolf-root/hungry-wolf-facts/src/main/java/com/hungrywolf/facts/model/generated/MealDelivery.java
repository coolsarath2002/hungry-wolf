package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MealDelivery
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class MealDelivery   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mealId")
  private Integer mealId = null;

  @JsonProperty("deliveryType")
  private String deliveryType = null;

  @JsonProperty("mealDate")
  private ZonedDateTime mealDate = null;

  public MealDelivery id(Integer id) {
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

  public MealDelivery mealId(Integer mealId) {
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

  public MealDelivery deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

  /**
   * delivery type
   * @return deliveryType
  **/
  @ApiModelProperty(example = "pickup, delivery", value = "delivery type")


  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }

  public MealDelivery mealDate(ZonedDateTime mealDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MealDelivery mealDelivery = (MealDelivery) o;
    return Objects.equals(this.id, mealDelivery.id) &&
        Objects.equals(this.mealId, mealDelivery.mealId) &&
        Objects.equals(this.deliveryType, mealDelivery.deliveryType) &&
        Objects.equals(this.mealDate, mealDelivery.mealDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mealId, deliveryType, mealDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MealDelivery {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mealId: ").append(toIndentedString(mealId)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    mealDate: ").append(toIndentedString(mealDate)).append("\n");
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

