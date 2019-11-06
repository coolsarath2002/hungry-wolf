package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hungrywolf.facts.model.generated.PricingInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PricingInfos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T22:41:29.904-08:00")

public class PricingInfos   {
  @JsonProperty("pricingType")
  private String pricingType = null;

  @JsonProperty("pricingInfo")
  @Valid
  private List<PricingInfo> pricingInfo = null;

  public PricingInfos pricingType(String pricingType) {
    this.pricingType = pricingType;
    return this;
  }

  /**
   * delivery type
   * @return pricingType
  **/
  @ApiModelProperty(example = "pickup, delivery", value = "delivery type")


  public String getPricingType() {
    return pricingType;
  }

  public void setPricingType(String pricingType) {
    this.pricingType = pricingType;
  }

  public PricingInfos pricingInfo(List<PricingInfo> pricingInfo) {
    this.pricingInfo = pricingInfo;
    return this;
  }

  public PricingInfos addPricingInfoItem(PricingInfo pricingInfoItem) {
    if (this.pricingInfo == null) {
      this.pricingInfo = new ArrayList<>();
    }
    this.pricingInfo.add(pricingInfoItem);
    return this;
  }

  /**
   * Get pricingInfo
   * @return pricingInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PricingInfo> getPricingInfo() {
    return pricingInfo;
  }

  public void setPricingInfo(List<PricingInfo> pricingInfo) {
    this.pricingInfo = pricingInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingInfos pricingInfos = (PricingInfos) o;
    return Objects.equals(this.pricingType, pricingInfos.pricingType) &&
        Objects.equals(this.pricingInfo, pricingInfos.pricingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricingType, pricingInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingInfos {\n");
    
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    pricingInfo: ").append(toIndentedString(pricingInfo)).append("\n");
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

