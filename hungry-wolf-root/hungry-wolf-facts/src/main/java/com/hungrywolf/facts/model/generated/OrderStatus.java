package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hungrywolf.facts.model.generated.OrderStatusTracker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-06T23:59:46.035-08:00")

public class OrderStatus   {
  @JsonProperty("orderHwrn")
  private String orderHwrn = null;

  /**
   * Gets or Sets orderStatus
   */
  public enum OrderStatusEnum {
    OPEN("OPEN"),
    
    CANCELLED("CANCELLED"),
    
    SUSPENDED("SUSPENDED"),
    
    COMPLETED("COMPLETED");

    private String value;

    OrderStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrderStatusEnum fromValue(String text) {
      for (OrderStatusEnum b : OrderStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("orderStatus")
  private OrderStatusEnum orderStatus = null;

  @JsonProperty("reasonCd")
  private String reasonCd = null;

  @JsonProperty("reasonNotes")
  private String reasonNotes = null;

  @JsonProperty("items")
  @Valid
  private List<OrderStatusTracker> items = null;

  public OrderStatus orderHwrn(String orderHwrn) {
    this.orderHwrn = orderHwrn;
    return this;
  }

  /**
   * Get orderHwrn
   * @return orderHwrn
  **/
  @ApiModelProperty(value = "")


  public String getOrderHwrn() {
    return orderHwrn;
  }

  public void setOrderHwrn(String orderHwrn) {
    this.orderHwrn = orderHwrn;
  }

  public OrderStatus orderStatus(OrderStatusEnum orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Get orderStatus
   * @return orderStatus
  **/
  @ApiModelProperty(value = "")


  public OrderStatusEnum getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderStatusEnum orderStatus) {
    this.orderStatus = orderStatus;
  }

  public OrderStatus reasonCd(String reasonCd) {
    this.reasonCd = reasonCd;
    return this;
  }

  /**
   * Get reasonCd
   * @return reasonCd
  **/
  @ApiModelProperty(value = "")


  public String getReasonCd() {
    return reasonCd;
  }

  public void setReasonCd(String reasonCd) {
    this.reasonCd = reasonCd;
  }

  public OrderStatus reasonNotes(String reasonNotes) {
    this.reasonNotes = reasonNotes;
    return this;
  }

  /**
   * Get reasonNotes
   * @return reasonNotes
  **/
  @ApiModelProperty(value = "")


  public String getReasonNotes() {
    return reasonNotes;
  }

  public void setReasonNotes(String reasonNotes) {
    this.reasonNotes = reasonNotes;
  }

  public OrderStatus items(List<OrderStatusTracker> items) {
    this.items = items;
    return this;
  }

  public OrderStatus addItemsItem(OrderStatusTracker itemsItem) {
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

  public List<OrderStatusTracker> getItems() {
    return items;
  }

  public void setItems(List<OrderStatusTracker> items) {
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
    OrderStatus orderStatus = (OrderStatus) o;
    return Objects.equals(this.orderHwrn, orderStatus.orderHwrn) &&
        Objects.equals(this.orderStatus, orderStatus.orderStatus) &&
        Objects.equals(this.reasonCd, orderStatus.reasonCd) &&
        Objects.equals(this.reasonNotes, orderStatus.reasonNotes) &&
        Objects.equals(this.items, orderStatus.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderHwrn, orderStatus, reasonCd, reasonNotes, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatus {\n");
    
    sb.append("    orderHwrn: ").append(toIndentedString(orderHwrn)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    reasonCd: ").append(toIndentedString(reasonCd)).append("\n");
    sb.append("    reasonNotes: ").append(toIndentedString(reasonNotes)).append("\n");
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

