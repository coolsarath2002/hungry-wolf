package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hungrywolf.facts.model.generated.Chef;
import com.hungrywolf.facts.model.generated.MealTags;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Meal
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class Meal   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("mealDate")
  private ZonedDateTime mealDate = null;

  @JsonProperty("chef")
  private Chef chef = null;

  @JsonProperty("tags")
  private MealTags tags = null;

  public Meal id(Integer id) {
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

  public Meal title(String title) {
    this.title = title;
    return this;
  }

  /**
   * asdfasd
   * @return title
  **/
  @ApiModelProperty(example = "adadas", value = "asdfasd")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Meal image(String image) {
    this.image = image;
    return this;
  }

  /**
   * url for the meal
   * @return image
  **/
  @ApiModelProperty(example = "1", value = "url for the meal")


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Meal mealDate(ZonedDateTime mealDate) {
    this.mealDate = mealDate;
    return this;
  }

  /**
   * Meal Start Date
   * @return mealDate
  **/
  @ApiModelProperty(example = "2018-06-22T00:00:00.000+0000", value = "Meal Start Date")

  @Valid

  public ZonedDateTime getMealDate() {
    return mealDate;
  }

  public void setMealDate(ZonedDateTime mealDate) {
    this.mealDate = mealDate;
  }

  public Meal chef(Chef chef) {
    this.chef = chef;
    return this;
  }

  /**
   * Get chef
   * @return chef
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Chef getChef() {
    return chef;
  }

  public void setChef(Chef chef) {
    this.chef = chef;
  }

  public Meal tags(MealTags tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MealTags getTags() {
    return tags;
  }

  public void setTags(MealTags tags) {
    this.tags = tags;
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
    return Objects.equals(this.id, meal.id) &&
        Objects.equals(this.title, meal.title) &&
        Objects.equals(this.image, meal.image) &&
        Objects.equals(this.mealDate, meal.mealDate) &&
        Objects.equals(this.chef, meal.chef) &&
        Objects.equals(this.tags, meal.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, image, mealDate, chef, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meal {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    mealDate: ").append(toIndentedString(mealDate)).append("\n");
    sb.append("    chef: ").append(toIndentedString(chef)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

