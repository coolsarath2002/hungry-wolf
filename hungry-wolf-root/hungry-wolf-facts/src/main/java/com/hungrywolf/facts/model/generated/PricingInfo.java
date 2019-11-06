package com.hungrywolf.facts.model.generated;

import java.math.BigDecimal;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PricingInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T22:41:29.904-08:00")

public class PricingInfo   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("rateCd")
  private String rateCd = null;

  @JsonProperty("rate")
  private BigDecimal rate = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("rateType")
  private String rateType = null;

  public PricingInfo id(Integer id) {
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

  public PricingInfo rateCd(String rateCd) {
    this.rateCd = rateCd;
    return this;
  }

  /**
   * Get rateCd
   * @return rateCd
  **/
  @ApiModelProperty(value = "")


  public String getRateCd() {
    return rateCd;
  }

  public void setRateCd(String rateCd) {
    this.rateCd = rateCd;
  }

  public PricingInfo rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(value = "")


  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public PricingInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PricingInfo rateType(String rateType) {
    this.rateType = rateType;
    return this;
  }

  /**
   * Get rateType
   * @return rateType
  **/
  @ApiModelProperty(value = "")


  public String getRateType() {
    return rateType;
  }

  public void setRateType(String rateType) {
    this.rateType = rateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingInfo pricingInfo = (PricingInfo) o;
    return Objects.equals(this.id, pricingInfo.id) &&
        Objects.equals(this.rateCd, pricingInfo.rateCd) &&
        Objects.equals(this.rate, pricingInfo.rate) &&
        Objects.equals(this.currency, pricingInfo.currency) &&
        Objects.equals(this.rateType, pricingInfo.rateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rateCd, rate, currency, rateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rateCd: ").append(toIndentedString(rateCd)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
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

