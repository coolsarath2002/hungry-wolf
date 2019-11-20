package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hungrywolf.facts.model.generated.MealDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-06T23:59:46.035-08:00")

public class OrderItems   {
  @JsonProperty("cartItemId")
  private Integer cartItemId = null;
  
  @JsonProperty("orderItemHWRN")
  private String orderItemHWRN = null;

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

  @JsonProperty("scheduleDeliveryDate")
  private ZonedDateTime scheduleDeliveryDate = null;

  @JsonProperty("actualDelivertDate")
  private String actualDelivertDate = null;

  /**
   * D - delivery P - Pickup
   */
  public enum DeliveryMethodEnum {
    D("D"),
    
    P("P");

    private String value;

    DeliveryMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeliveryMethodEnum fromValue(String text) {
      for (DeliveryMethodEnum b : DeliveryMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("deliveryMethod")
  private DeliveryMethodEnum deliveryMethod = null;

  public OrderItems cartItemId(Integer cartItemId) {
    this.cartItemId = cartItemId;
    return this;
  }

  /**
   * Get cartItemId
   * @return cartItemId
  **/
  @ApiModelProperty(example = "123456", value = "")


  public Integer getCartItemId() {
    return cartItemId;
  }

  public void setCartItemId(Integer cartItemId) {
    this.cartItemId = cartItemId;
  }

  public OrderItems mealDetails(MealDetails mealDetails) {
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

  public OrderItems isCustomChanges(Boolean isCustomChanges) {
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

  public OrderItems chefId(Integer chefId) {
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

  public OrderItems quantity(Integer quantity) {
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

  public OrderItems createdDate(ZonedDateTime createdDate) {
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

  public OrderItems createdUser(String createdUser) {
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

  public OrderItems modifiedDate(ZonedDateTime modifiedDate) {
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

  public OrderItems modifiedUser(String modifiedUser) {
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

  public OrderItems scheduleDeliveryDate(ZonedDateTime scheduleDeliveryDate) {
    this.scheduleDeliveryDate = scheduleDeliveryDate;
    return this;
  }

  /**
   * Get scheduleDeliveryDate
   * @return scheduleDeliveryDate
  **/
  @ApiModelProperty(example = "31/03/2019", value = "")

  @Valid

  public ZonedDateTime getScheduleDeliveryDate() {
    return scheduleDeliveryDate;
  }

  public void setScheduleDeliveryDate(ZonedDateTime scheduleDeliveryDate) {
    this.scheduleDeliveryDate = scheduleDeliveryDate;
  }

  public OrderItems actualDelivertDate(String actualDelivertDate) {
    this.actualDelivertDate = actualDelivertDate;
    return this;
  }

  /**
   * Get actualDelivertDate
   * @return actualDelivertDate
  **/
  @ApiModelProperty(example = "31/03/2019", value = "")


  public String getActualDelivertDate() {
    return actualDelivertDate;
  }

  public void setActualDelivertDate(String actualDelivertDate) {
    this.actualDelivertDate = actualDelivertDate;
  }

  public OrderItems deliveryMethod(DeliveryMethodEnum deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * D - delivery P - Pickup
   * @return deliveryMethod
  **/
  @ApiModelProperty(value = "D - delivery P - Pickup")


  public DeliveryMethodEnum getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(DeliveryMethodEnum deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItems orderItems = (OrderItems) o;
    return Objects.equals(this.cartItemId, orderItems.cartItemId) &&
        Objects.equals(this.mealDetails, orderItems.mealDetails) &&
        Objects.equals(this.isCustomChanges, orderItems.isCustomChanges) &&
        Objects.equals(this.chefId, orderItems.chefId) &&
        Objects.equals(this.quantity, orderItems.quantity) &&
        Objects.equals(this.createdDate, orderItems.createdDate) &&
        Objects.equals(this.createdUser, orderItems.createdUser) &&
        Objects.equals(this.modifiedDate, orderItems.modifiedDate) &&
        Objects.equals(this.modifiedUser, orderItems.modifiedUser) &&
        Objects.equals(this.scheduleDeliveryDate, orderItems.scheduleDeliveryDate) &&
        Objects.equals(this.actualDelivertDate, orderItems.actualDelivertDate) &&
        Objects.equals(this.deliveryMethod, orderItems.deliveryMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartItemId, mealDetails, isCustomChanges, chefId, quantity, createdDate, createdUser, modifiedDate, modifiedUser, scheduleDeliveryDate, actualDelivertDate, deliveryMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItems {\n");
    
    sb.append("    cartItemId: ").append(toIndentedString(cartItemId)).append("\n");
    sb.append("    mealDetails: ").append(toIndentedString(mealDetails)).append("\n");
    sb.append("    isCustomChanges: ").append(toIndentedString(isCustomChanges)).append("\n");
    sb.append("    chefId: ").append(toIndentedString(chefId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedUser: ").append(toIndentedString(modifiedUser)).append("\n");
    sb.append("    scheduleDeliveryDate: ").append(toIndentedString(scheduleDeliveryDate)).append("\n");
    sb.append("    actualDelivertDate: ").append(toIndentedString(actualDelivertDate)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
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

public String getOrderItemHWRN() {
	return orderItemHWRN;
}

public void setOrderItemHWRN(String orderItemHWRN) {
	this.orderItemHWRN = orderItemHWRN;
}

public Boolean getIsCustomChanges() {
	return isCustomChanges;
}
}

