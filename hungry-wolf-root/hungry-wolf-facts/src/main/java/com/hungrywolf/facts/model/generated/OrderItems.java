package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class OrderItems   {
  @JsonProperty("cartItemId")
  private Integer cartItemId = null;

  @JsonProperty("scheduledDeliveryDate")
  private String scheduledDeliveryDate = null;

  @JsonProperty("scheduledDeliveryTime")
  private String scheduledDeliveryTime = null;

  /**
   * Gets or Sets deliveryMethod
   */
  public enum DeliveryMethodEnum {
    DELIVERY("DELIVERY"),
    
    PICK_UP("PICK-UP");

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

  public OrderItems scheduledDeliveryDate(String scheduledDeliveryDate) {
    this.scheduledDeliveryDate = scheduledDeliveryDate;
    return this;
  }

  /**
   * Get scheduledDeliveryDate
   * @return scheduledDeliveryDate
  **/
  @ApiModelProperty(example = "31/03/2019", value = "")


  public String getScheduledDeliveryDate() {
    return scheduledDeliveryDate;
  }

  public void setScheduledDeliveryDate(String scheduledDeliveryDate) {
    this.scheduledDeliveryDate = scheduledDeliveryDate;
  }

  public OrderItems scheduledDeliveryTime(String scheduledDeliveryTime) {
    this.scheduledDeliveryTime = scheduledDeliveryTime;
    return this;
  }

  /**
   * Get scheduledDeliveryTime
   * @return scheduledDeliveryTime
  **/
  @ApiModelProperty(example = "18:05:00", value = "")


  public String getScheduledDeliveryTime() {
    return scheduledDeliveryTime;
  }

  public void setScheduledDeliveryTime(String scheduledDeliveryTime) {
    this.scheduledDeliveryTime = scheduledDeliveryTime;
  }

  public OrderItems deliveryMethod(DeliveryMethodEnum deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * Get deliveryMethod
   * @return deliveryMethod
  **/
  @ApiModelProperty(value = "")


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
        Objects.equals(this.scheduledDeliveryDate, orderItems.scheduledDeliveryDate) &&
        Objects.equals(this.scheduledDeliveryTime, orderItems.scheduledDeliveryTime) &&
        Objects.equals(this.deliveryMethod, orderItems.deliveryMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartItemId, scheduledDeliveryDate, scheduledDeliveryTime, deliveryMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItems {\n");
    
    sb.append("    cartItemId: ").append(toIndentedString(cartItemId)).append("\n");
    sb.append("    scheduledDeliveryDate: ").append(toIndentedString(scheduledDeliveryDate)).append("\n");
    sb.append("    scheduledDeliveryTime: ").append(toIndentedString(scheduledDeliveryTime)).append("\n");
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
}

