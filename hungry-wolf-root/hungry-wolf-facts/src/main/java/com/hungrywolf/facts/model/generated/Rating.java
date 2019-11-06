package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hungrywolf.facts.model.generated.RatingDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Rating
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-30T00:36:20.691-07:00")

public class Rating   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("overall")
  private BigDecimal overall = null;

  @JsonProperty("detail")
  private RatingDetails detail = null;

  public Rating id(String id) {
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

  public Rating overall(BigDecimal overall) {
    this.overall = overall;
    return this;
  }

  /**
   * Get overall
   * @return overall
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOverall() {
    return overall;
  }

  public void setOverall(BigDecimal overall) {
    this.overall = overall;
  }

  public Rating detail(RatingDetails detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RatingDetails getDetail() {
    return detail;
  }

  public void setDetail(RatingDetails detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rating rating = (Rating) o;
    return Objects.equals(this.id, rating.id) &&
        Objects.equals(this.overall, rating.overall) &&
        Objects.equals(this.detail, rating.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, overall, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

