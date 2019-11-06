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
 * MealItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class MealItems   {
  @JsonProperty("mealId")
  private Integer mealId = null;

  @JsonProperty("itemId")
  private Integer itemId = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("dishType")
  private String dishType = null;

  @JsonProperty("measurement")
  private String measurement = null;

  public MealItems mealId(Integer mealId) {
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

  public MealItems itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * sdfsdf
   * @return itemId
  **/
  @ApiModelProperty(value = "sdfsdf")


  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public MealItems desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * meal item desc
   * @return desc
  **/
  @ApiModelProperty(value = "meal item desc")


  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public MealItems dishType(String dishType) {
    this.dishType = dishType;
    return this;
  }

  /**
   * gravy/sauce
   * @return dishType
  **/
  @ApiModelProperty(value = "gravy/sauce")


  public String getDishType() {
    return dishType;
  }

  public void setDishType(String dishType) {
    this.dishType = dishType;
  }

  public MealItems measurement(String measurement) {
    this.measurement = measurement;
    return this;
  }

  /**
   * serving measurement
   * @return measurement
  **/
  @ApiModelProperty(value = "serving measurement")


  public String getMeasurement() {
    return measurement;
  }

  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MealItems mealItems = (MealItems) o;
    return Objects.equals(this.mealId, mealItems.mealId) &&
        Objects.equals(this.itemId, mealItems.itemId) &&
        Objects.equals(this.desc, mealItems.desc) &&
        Objects.equals(this.dishType, mealItems.dishType) &&
        Objects.equals(this.measurement, mealItems.measurement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mealId, itemId, desc, dishType, measurement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MealItems {\n");
    
    sb.append("    mealId: ").append(toIndentedString(mealId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    dishType: ").append(toIndentedString(dishType)).append("\n");
    sb.append("    measurement: ").append(toIndentedString(measurement)).append("\n");
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

