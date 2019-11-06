package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hungrywolf.facts.model.generated.ChefRatingDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChefRatingDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-05T02:01:17.900-08:00")

public class ChefRatingDetails   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mealId")
  private Integer mealId = null;

  @JsonProperty("chefId")
  private Integer chefId = null;

  @JsonProperty("items")
  @Valid
  private List<ChefRatingDetail> items = null;

  public ChefRatingDetails id(Integer id) {
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

  public ChefRatingDetails mealId(Integer mealId) {
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

  public ChefRatingDetails chefId(Integer chefId) {
    this.chefId = chefId;
    return this;
  }

  /**
   * Get chefId
   * @return chefId
  **/
  @ApiModelProperty(value = "")


  public Integer getChefId() {
    return chefId;
  }

  public void setChefId(Integer chefId) {
    this.chefId = chefId;
  }

  public ChefRatingDetails items(List<ChefRatingDetail> items) {
    this.items = items;
    return this;
  }

  public ChefRatingDetails addItemsItem(ChefRatingDetail itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ChefRatingDetail> getItems() {
    return items;
  }

  public void setItems(List<ChefRatingDetail> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChefRatingDetails chefRatingDetails = (ChefRatingDetails) o;
    return Objects.equals(this.id, chefRatingDetails.id) &&
        Objects.equals(this.mealId, chefRatingDetails.mealId) &&
        Objects.equals(this.chefId, chefRatingDetails.chefId) &&
        Objects.equals(this.items, chefRatingDetails.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mealId, chefId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChefRatingDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mealId: ").append(toIndentedString(mealId)).append("\n");
    sb.append("    chefId: ").append(toIndentedString(chefId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

