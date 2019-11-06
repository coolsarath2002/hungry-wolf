package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hungrywolf.facts.model.generated.OrderItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class Order   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("orderHwrn")
  private String orderHwrn = null;

  @JsonProperty("createdDate")
  private ZonedDateTime createdDate = null;

  @JsonProperty("orderPlacedDate")
  private ZonedDateTime orderPlacedDate = null;

  @JsonProperty("modifiedDate")
  private ZonedDateTime modifiedDate = null;

  /**
   * Gets or Sets applyDiscount
   */
  public enum ApplyDiscountEnum {
    NONE("NONE"),
    
    FIRSTFIV("FIRSTFIV"),
    
    HUNGRYCHALLENGE("HUNGRYCHALLENGE"),
    
    BETHECHANGE("BETHECHANGE"),
    
    HAPPYDA("HAPPYDA"),
    
    AWAYFROMHOME("AWAYFROMHOME"),
    
    MONTHEND("MONTHEND");

    private String value;

    ApplyDiscountEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApplyDiscountEnum fromValue(String text) {
      for (ApplyDiscountEnum b : ApplyDiscountEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("applyDiscount")
  private ApplyDiscountEnum applyDiscount = null;

  @JsonProperty("items")
  @Valid
  private List<OrderItems> items = null;

  public Order id(Integer id) {
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

  public Order orderHwrn(String orderHwrn) {
    this.orderHwrn = orderHwrn;
    return this;
  }

  /**
   * Get orderHwrn
   * @return orderHwrn
  **/
  @ApiModelProperty(example = "0012459-1235689-154263", value = "")


  public String getOrderHwrn() {
    return orderHwrn;
  }

  public void setOrderHwrn(String orderHwrn) {
    this.orderHwrn = orderHwrn;
  }

  public Order createdDate(ZonedDateTime createdDate) {
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

  public Order orderPlacedDate(ZonedDateTime orderPlacedDate) {
    this.orderPlacedDate = orderPlacedDate;
    return this;
  }

  /**
   * Get orderPlacedDate
   * @return orderPlacedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getOrderPlacedDate() {
    return orderPlacedDate;
  }

  public void setOrderPlacedDate(ZonedDateTime orderPlacedDate) {
    this.orderPlacedDate = orderPlacedDate;
  }

  public Order modifiedDate(ZonedDateTime modifiedDate) {
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

  public Order applyDiscount(ApplyDiscountEnum applyDiscount) {
    this.applyDiscount = applyDiscount;
    return this;
  }

  /**
   * Get applyDiscount
   * @return applyDiscount
  **/
  @ApiModelProperty(example = "HUNGRYCHALLENGE", value = "")


  public ApplyDiscountEnum getApplyDiscount() {
    return applyDiscount;
  }

  public void setApplyDiscount(ApplyDiscountEnum applyDiscount) {
    this.applyDiscount = applyDiscount;
  }

  public Order items(List<OrderItems> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(OrderItems itemsItem) {
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

  public List<OrderItems> getItems() {
    return items;
  }

  public void setItems(List<OrderItems> items) {
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
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.orderHwrn, order.orderHwrn) &&
        Objects.equals(this.createdDate, order.createdDate) &&
        Objects.equals(this.orderPlacedDate, order.orderPlacedDate) &&
        Objects.equals(this.modifiedDate, order.modifiedDate) &&
        Objects.equals(this.applyDiscount, order.applyDiscount) &&
        Objects.equals(this.items, order.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderHwrn, createdDate, orderPlacedDate, modifiedDate, applyDiscount, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderHwrn: ").append(toIndentedString(orderHwrn)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    orderPlacedDate: ").append(toIndentedString(orderPlacedDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    applyDiscount: ").append(toIndentedString(applyDiscount)).append("\n");
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

