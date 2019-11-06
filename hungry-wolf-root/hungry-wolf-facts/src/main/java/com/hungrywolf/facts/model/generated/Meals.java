package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hungrywolf.facts.model.generated.Meal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Meals
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class Meals   {
  @JsonProperty("mealList")
  @Valid
  private List<Meal> mealList = null;

  public Meals mealList(List<Meal> mealList) {
    this.mealList = mealList;
    return this;
  }

  public Meals addMealListItem(Meal mealListItem) {
    if (this.mealList == null) {
      this.mealList = new ArrayList<>();
    }
    this.mealList.add(mealListItem);
    return this;
  }

  /**
   * Get mealList
   * @return mealList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Meal> getMealList() {
    return mealList;
  }

  public void setMealList(List<Meal> mealList) {
    this.mealList = mealList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meals meals = (Meals) o;
    return Objects.equals(this.mealList, meals.mealList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mealList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meals {\n");
    
    sb.append("    mealList: ").append(toIndentedString(mealList)).append("\n");
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

