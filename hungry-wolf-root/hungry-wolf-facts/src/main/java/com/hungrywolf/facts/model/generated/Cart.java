package com.hungrywolf.facts.model.generated;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Cart
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-06T20:18:58.567-08:00")

public class Cart   {
  @JsonProperty("id")
  private Integer id = null;
  
  @JsonProperty("cartHWRN")
  private String cartHWRN = null;
  
  @JsonProperty("wolfId")
  private Integer wolfId = null;

  @JsonProperty("createdDate")
  private ZonedDateTime createdDate = null;

  @JsonProperty("modifiedDate")
  private ZonedDateTime modifiedDate = null;

  @JsonProperty("wolfCartStatusCd")
  private String wolfCartStatusCd = null;

  @JsonProperty("wolfCartStatusDesc")
  private String wolfCartStatusDesc = null;

  @JsonProperty("auto_deleted")
  private Boolean autoDeleted = null;

  @JsonProperty("items")
  @Valid
  private List<CartItems> items = null;

  
  public Cart id(int id) {
		this.id = id;
		return this;
  }
  
  public Cart cartHWRN(String cartHWRN) {
    this.cartHWRN = cartHWRN;
    return this;
  }

  /**
   * Get cartHWRN
   * @return cartHWRN
  **/
  @ApiModelProperty(example = "00001-C456987", value = "")


  public String getCartHWRN() {
    return cartHWRN;
  }

  public void setCartHWRN(String cartHWRN) {
    this.cartHWRN = cartHWRN;
  }

  public Cart wolfId(Integer wolfId) {
    this.wolfId = wolfId;
    return this;
  }

  /**
   * Get wolfId
   * @return wolfId
  **/
  @ApiModelProperty(value = "")


  public Integer getWolfId() {
    return wolfId;
  }

  public void setWolfId(Integer wolfId) {
    this.wolfId = wolfId;
  }

  public Cart createdDate(ZonedDateTime createdDate) {
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

  public Cart modifiedDate(ZonedDateTime modifiedDate) {
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

  public Cart wolfCartStatusCd(String wolfCartStatusCd) {
    this.wolfCartStatusCd = wolfCartStatusCd;
    return this;
  }

  /**
   * Get wolfCartStatusCd
   * @return wolfCartStatusCd
  **/
  @ApiModelProperty(value = "")


  public String getWolfCartStatusCd() {
    return wolfCartStatusCd;
  }

  public void setWolfCartStatusCd(String wolfCartStatusCd) {
    this.wolfCartStatusCd = wolfCartStatusCd;
  }

  public Cart wolfCartStatusDesc(String wolfCartStatusDesc) {
    this.wolfCartStatusDesc = wolfCartStatusDesc;
    return this;
  }

  /**
   * Get wolfCartStatusDesc
   * @return wolfCartStatusDesc
  **/
  @ApiModelProperty(value = "")


  public String getWolfCartStatusDesc() {
    return wolfCartStatusDesc;
  }

  public void setWolfCartStatusDesc(String wolfCartStatusDesc) {
    this.wolfCartStatusDesc = wolfCartStatusDesc;
  }

  public Cart autoDeleted(Boolean autoDeleted) {
    this.autoDeleted = autoDeleted;
    return this;
  }

  /**
   * Get autoDeleted
   * @return autoDeleted
  **/
  @ApiModelProperty(value = "")


  public Boolean isAutoDeleted() {
    return autoDeleted;
  }

  public void setAutoDeleted(Boolean autoDeleted) {
    this.autoDeleted = autoDeleted;
  }

  public Cart items(List<CartItems> items) {
    this.items = items;
    return this;
  }

  public Cart addItemsItem(CartItems itemsItem) {
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

  public List<CartItems> getItems() {
    return items;
  }

  public void setItems(List<CartItems> items) {
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
    Cart cart = (Cart) o;
    return Objects.equals(this.cartHWRN, cart.cartHWRN) &&
        Objects.equals(this.wolfId, cart.wolfId) &&
        Objects.equals(this.createdDate, cart.createdDate) &&
        Objects.equals(this.modifiedDate, cart.modifiedDate) &&
        Objects.equals(this.wolfCartStatusCd, cart.wolfCartStatusCd) &&
        Objects.equals(this.wolfCartStatusDesc, cart.wolfCartStatusDesc) &&
        Objects.equals(this.autoDeleted, cart.autoDeleted) &&
        Objects.equals(this.items, cart.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartHWRN, wolfId, createdDate, modifiedDate, wolfCartStatusCd, wolfCartStatusDesc, autoDeleted, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("    cartHWRN: ").append(toIndentedString(cartHWRN)).append("\n");
    sb.append("    wolfId: ").append(toIndentedString(wolfId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    wolfCartStatusCd: ").append(toIndentedString(wolfCartStatusCd)).append("\n");
    sb.append("    wolfCartStatusDesc: ").append(toIndentedString(wolfCartStatusDesc)).append("\n");
    sb.append("    autoDeleted: ").append(toIndentedString(autoDeleted)).append("\n");
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

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Boolean getAutoDeleted() {
	return autoDeleted;
}


}

