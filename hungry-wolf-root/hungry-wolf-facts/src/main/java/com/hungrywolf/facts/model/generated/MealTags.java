package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MealTags
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class MealTags   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mealId")
  private Integer mealId = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  public MealTags id(Integer id) {
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

  public MealTags mealId(Integer mealId) {
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

  public MealTags tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MealTags addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
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
    MealTags mealTags = (MealTags) o;
    return Objects.equals(this.id, mealTags.id) &&
        Objects.equals(this.mealId, mealTags.mealId) &&
        Objects.equals(this.tags, mealTags.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mealId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MealTags {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mealId: ").append(toIndentedString(mealId)).append("\n");
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

