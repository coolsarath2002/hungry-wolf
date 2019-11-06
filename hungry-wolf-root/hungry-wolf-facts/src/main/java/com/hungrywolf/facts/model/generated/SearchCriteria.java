package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchCriteria
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class SearchCriteria   {
  @JsonProperty("searchBy")
  @Valid
  private List<String> searchBy = null;

  public SearchCriteria searchBy(List<String> searchBy) {
    this.searchBy = searchBy;
    return this;
  }

  public SearchCriteria addSearchByItem(String searchByItem) {
    if (this.searchBy == null) {
      this.searchBy = new ArrayList<>();
    }
    this.searchBy.add(searchByItem);
    return this;
  }

  /**
   * Get searchBy
   * @return searchBy
  **/
  @ApiModelProperty(value = "")


  public List<String> getSearchBy() {
    return searchBy;
  }

  public void setSearchBy(List<String> searchBy) {
    this.searchBy = searchBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCriteria searchCriteria = (SearchCriteria) o;
    return Objects.equals(this.searchBy, searchCriteria.searchBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteria {\n");
    
    sb.append("    searchBy: ").append(toIndentedString(searchBy)).append("\n");
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

