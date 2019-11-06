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
 * OrderStatusTracker
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class OrderStatusTracker   {
  /**
   * Gets or Sets step
   */
  public enum StepEnum {
    NOT_STARTED("NOT STARTED"),
    
    ORDER_PLACED("ORDER PLACED"),
    
    AWAITING_CHEF_ACCEPTANCE("AWAITING CHEF ACCEPTANCE"),
    
    CHEF_ACCEPTED("CHEF ACCEPTED"),
    
    PREPARATION("PREPARATION"),
    
    COOKING("COOKING"),
    
    PACKAGING("PACKAGING"),
    
    SHIPPING("SHIPPING"),
    
    READY_FOR_DELIVERY("READY FOR DELIVERY"),
    
    READY_FOR_PICKUP("READY FOR PICKUP");

    private String value;

    StepEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StepEnum fromValue(String text) {
      for (StepEnum b : StepEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("step")
  private StepEnum step = null;

  @JsonProperty("completedDate")
  private ZonedDateTime completedDate = null;

  @JsonProperty("dueDate")
  private ZonedDateTime dueDate = null;

  @JsonProperty("startDate")
  private ZonedDateTime startDate = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    COMPLETED("COMPLETED"),
    
    OPEN("OPEN"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public OrderStatusTracker step(StepEnum step) {
    this.step = step;
    return this;
  }

  /**
   * Get step
   * @return step
  **/
  @ApiModelProperty(value = "")


  public StepEnum getStep() {
    return step;
  }

  public void setStep(StepEnum step) {
    this.step = step;
  }

  public OrderStatusTracker completedDate(ZonedDateTime completedDate) {
    this.completedDate = completedDate;
    return this;
  }

  /**
   * Get completedDate
   * @return completedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(ZonedDateTime completedDate) {
    this.completedDate = completedDate;
  }

  public OrderStatusTracker dueDate(ZonedDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(ZonedDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public OrderStatusTracker startDate(ZonedDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(ZonedDateTime startDate) {
    this.startDate = startDate;
  }

  public OrderStatusTracker status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusTracker orderStatusTracker = (OrderStatusTracker) o;
    return Objects.equals(this.step, orderStatusTracker.step) &&
        Objects.equals(this.completedDate, orderStatusTracker.completedDate) &&
        Objects.equals(this.dueDate, orderStatusTracker.dueDate) &&
        Objects.equals(this.startDate, orderStatusTracker.startDate) &&
        Objects.equals(this.status, orderStatusTracker.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, completedDate, dueDate, startDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusTracker {\n");
    
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

