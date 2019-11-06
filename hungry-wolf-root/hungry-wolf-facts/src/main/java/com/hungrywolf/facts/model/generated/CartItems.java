package com.hungrywolf.facts.model.generated;

import java.time.ZonedDateTime;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CartItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-05T23:39:32.833-08:00")

public class CartItems   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mealDetails")
  private MealDetails mealDetails = null;

  @JsonProperty("isCustomChanges")
  private Boolean isCustomChanges = null;

  @JsonProperty("chefId")
  private Integer chefId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("createdDate")
  private ZonedDateTime createdDate = null;

  @JsonProperty("createdUser")
  private String createdUser = null;

  @JsonProperty("modifiedDate")
  private ZonedDateTime modifiedDate = null;

  @JsonProperty("modifiedUser")
  private String modifiedUser = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  public CartItems id(Integer id) {
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

  public CartItems mealDetails(MealDetails mealDetails) {
    this.mealDetails = mealDetails;
    return this;
  }

  /**
   * Get mealDetails
   * @return mealDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MealDetails getMealDetails() {
    return mealDetails;
  }

  public void setMealDetails(MealDetails mealDetails) {
    this.mealDetails = mealDetails;
  }

  public CartItems isCustomChanges(Boolean isCustomChanges) {
    this.isCustomChanges = isCustomChanges;
    return this;
  }

  /**
   * Get isCustomChanges
   * @return isCustomChanges
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsCustomChanges() {
    return isCustomChanges;
  }

  public void setIsCustomChanges(Boolean isCustomChanges) {
    this.isCustomChanges = isCustomChanges;
  }

  public CartItems chefId(Integer chefId) {
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

  public CartItems quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public CartItems createdDate(ZonedDateTime createdDate) {
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

  public CartItems createdUser(String createdUser) {
    this.createdUser = createdUser;
    return this;
  }

  /**
   * Get createdUser
   * @return createdUser
  **/
  @ApiModelProperty(value = "")


  public String getCreatedUser() {
    return createdUser;
  }

  public void setCreatedUser(String createdUser) {
    this.createdUser = createdUser;
  }

  public CartItems modifiedDate(ZonedDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(ZonedDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public CartItems modifiedUser(String modifiedUser) {
    this.modifiedUser = modifiedUser;
    return this;
  }

  /**
   * Get modifiedUser
   * @return modifiedUser
  **/
  @ApiModelProperty(value = "")


  public String getModifiedUser() {
    return modifiedUser;
  }

  public void setModifiedUser(String modifiedUser) {
    this.modifiedUser = modifiedUser;
  }

  public CartItems isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItems cartItems = (CartItems) o;
    return Objects.equals(this.id, cartItems.id) &&
        Objects.equals(this.mealDetails, cartItems.mealDetails) &&
        Objects.equals(this.isCustomChanges, cartItems.isCustomChanges) &&
        Objects.equals(this.chefId, cartItems.chefId) &&
        Objects.equals(this.quantity, cartItems.quantity) &&
        Objects.equals(this.createdDate, cartItems.createdDate) &&
        Objects.equals(this.createdUser, cartItems.createdUser) &&
        Objects.equals(this.modifiedDate, cartItems.modifiedDate) &&
        Objects.equals(this.modifiedUser, cartItems.modifiedUser) &&
        Objects.equals(this.isDeleted, cartItems.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mealDetails, isCustomChanges, chefId, quantity, createdDate, createdUser, modifiedDate, modifiedUser, isDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mealDetails: ").append(toIndentedString(mealDetails)).append("\n");
    sb.append("    isCustomChanges: ").append(toIndentedString(isCustomChanges)).append("\n");
    sb.append("    chefId: ").append(toIndentedString(chefId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedUser: ").append(toIndentedString(modifiedUser)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

