package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IdentityCheck
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class IdentityCheck   {
  @JsonProperty("IdentityCheckId")
  private Integer identityCheckId = null;

  /**
   * Gets or Sets idCheckType
   */
  public enum IdCheckTypeEnum {
    EMAIL("EMAIL"),
    
    PHONE("PHONE");

    private String value;

    IdCheckTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IdCheckTypeEnum fromValue(String text) {
      for (IdCheckTypeEnum b : IdCheckTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("IDCheckType")
  private IdCheckTypeEnum idCheckType = null;

  @JsonProperty("verifiedDate")
  private ZonedDateTime verifiedDate = null;

  /**
   * Gets or Sets identityCheckStatus
   */
  public enum IdentityCheckStatusEnum {
    VERIFIED("VERIFIED"),
    
    NOT_VERIFIED("NOT-VERIFIED"),
    
    NONE("NONE");

    private String value;

    IdentityCheckStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IdentityCheckStatusEnum fromValue(String text) {
      for (IdentityCheckStatusEnum b : IdentityCheckStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("identityCheckStatus")
  private IdentityCheckStatusEnum identityCheckStatus = null;

  @JsonProperty("userId")
  private String userId = null;

  public IdentityCheck identityCheckId(Integer identityCheckId) {
    this.identityCheckId = identityCheckId;
    return this;
  }

  /**
   * Get identityCheckId
   * @return identityCheckId
  **/
  @ApiModelProperty(value = "")


  public Integer getIdentityCheckId() {
    return identityCheckId;
  }

  public void setIdentityCheckId(Integer identityCheckId) {
    this.identityCheckId = identityCheckId;
  }

  public IdentityCheck idCheckType(IdCheckTypeEnum idCheckType) {
    this.idCheckType = idCheckType;
    return this;
  }

  /**
   * Get idCheckType
   * @return idCheckType
  **/
  @ApiModelProperty(value = "")


  public IdCheckTypeEnum getIdCheckType() {
    return idCheckType;
  }

  public void setIdCheckType(IdCheckTypeEnum idCheckType) {
    this.idCheckType = idCheckType;
  }

  public IdentityCheck verifiedDate(ZonedDateTime verifiedDate) {
    this.verifiedDate = verifiedDate;
    return this;
  }

  /**
   * Get verifiedDate
   * @return verifiedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getVerifiedDate() {
    return verifiedDate;
  }

  public void setVerifiedDate(ZonedDateTime verifiedDate) {
    this.verifiedDate = verifiedDate;
  }

  public IdentityCheck identityCheckStatus(IdentityCheckStatusEnum identityCheckStatus) {
    this.identityCheckStatus = identityCheckStatus;
    return this;
  }

  /**
   * Get identityCheckStatus
   * @return identityCheckStatus
  **/
  @ApiModelProperty(value = "")


  public IdentityCheckStatusEnum getIdentityCheckStatus() {
    return identityCheckStatus;
  }

  public void setIdentityCheckStatus(IdentityCheckStatusEnum identityCheckStatus) {
    this.identityCheckStatus = identityCheckStatus;
  }

  public IdentityCheck userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityCheck identityCheck = (IdentityCheck) o;
    return Objects.equals(this.identityCheckId, identityCheck.identityCheckId) &&
        Objects.equals(this.idCheckType, identityCheck.idCheckType) &&
        Objects.equals(this.verifiedDate, identityCheck.verifiedDate) &&
        Objects.equals(this.identityCheckStatus, identityCheck.identityCheckStatus) &&
        Objects.equals(this.userId, identityCheck.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityCheckId, idCheckType, verifiedDate, identityCheckStatus, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityCheck {\n");
    
    sb.append("    identityCheckId: ").append(toIndentedString(identityCheckId)).append("\n");
    sb.append("    idCheckType: ").append(toIndentedString(idCheckType)).append("\n");
    sb.append("    verifiedDate: ").append(toIndentedString(verifiedDate)).append("\n");
    sb.append("    identityCheckStatus: ").append(toIndentedString(identityCheckStatus)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

