package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RatingDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-30T00:36:20.691-07:00")

public class RatingDetails   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("mealId")
  private String mealId = null;

  @JsonProperty("quality")
  private BigDecimal quality = null;

  @JsonProperty("delivery")
  private BigDecimal delivery = null;

  @JsonProperty("quantity")
  private BigDecimal quantity = null;

  @JsonProperty("taste")
  private BigDecimal taste = null;

  @JsonProperty("packing")
  private BigDecimal packing = null;

  @JsonProperty("misc")
  private BigDecimal misc = null;

  public RatingDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RatingDetails mealId(String mealId) {
    this.mealId = mealId;
    return this;
  }

  /**
   * Get mealId
   * @return mealId
  **/
  @ApiModelProperty(value = "")


  public String getMealId() {
    return mealId;
  }

  public void setMealId(String mealId) {
    this.mealId = mealId;
  }

  public RatingDetails quality(BigDecimal quality) {
    this.quality = quality;
    return this;
  }

  /**
   * amount
   * @return quality
  **/
  @ApiModelProperty(example = "15.25", value = "amount")

  @Valid

  public BigDecimal getQuality() {
    return quality;
  }

  public void setQuality(BigDecimal quality) {
    this.quality = quality;
  }

  public RatingDetails delivery(BigDecimal delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * amount
   * @return delivery
  **/
  @ApiModelProperty(example = "15.25", value = "amount")

  @Valid

  public BigDecimal getDelivery() {
    return delivery;
  }

  public void setDelivery(BigDecimal delivery) {
    this.delivery = delivery;
  }

  public RatingDetails quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * amount
   * @return quantity
  **/
  @ApiModelProperty(example = "15.25", value = "amount")

  @Valid

  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public RatingDetails taste(BigDecimal taste) {
    this.taste = taste;
    return this;
  }

  /**
   * amount
   * @return taste
  **/
  @ApiModelProperty(example = "15.25", value = "amount")

  @Valid

  public BigDecimal getTaste() {
    return taste;
  }

  public void setTaste(BigDecimal taste) {
    this.taste = taste;
  }

  public RatingDetails packing(BigDecimal packing) {
    this.packing = packing;
    return this;
  }

  /**
   * amount
   * @return packing
  **/
  @ApiModelProperty(example = "15.25", value = "amount")

  @Valid

  public BigDecimal getPacking() {
    return packing;
  }

  public void setPacking(BigDecimal packing) {
    this.packing = packing;
  }

  public RatingDetails misc(BigDecimal misc) {
    this.misc = misc;
    return this;
  }

  /**
   * amount
   * @return misc
  **/
  @ApiModelProperty(example = "15.25", value = "amount")

  @Valid

  public BigDecimal getMisc() {
    return misc;
  }

  public void setMisc(BigDecimal misc) {
    this.misc = misc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingDetails ratingDetails = (RatingDetails) o;
    return Objects.equals(this.id, ratingDetails.id) &&
        Objects.equals(this.mealId, ratingDetails.mealId) &&
        Objects.equals(this.quality, ratingDetails.quality) &&
        Objects.equals(this.delivery, ratingDetails.delivery) &&
        Objects.equals(this.quantity, ratingDetails.quantity) &&
        Objects.equals(this.taste, ratingDetails.taste) &&
        Objects.equals(this.packing, ratingDetails.packing) &&
        Objects.equals(this.misc, ratingDetails.misc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mealId, quality, delivery, quantity, taste, packing, misc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mealId: ").append(toIndentedString(mealId)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    taste: ").append(toIndentedString(taste)).append("\n");
    sb.append("    packing: ").append(toIndentedString(packing)).append("\n");
    sb.append("    misc: ").append(toIndentedString(misc)).append("\n");
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

