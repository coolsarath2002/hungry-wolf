package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hungrywolf.facts.model.generated.SearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MealsSearch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class MealsSearch   {
  @JsonProperty("criteria")
  @Valid
  private List<SearchCriteria> criteria = null;

  @JsonProperty("sortBy")
  private String sortBy = null;

  public MealsSearch criteria(List<SearchCriteria> criteria) {
    this.criteria = criteria;
    return this;
  }

  public MealsSearch addCriteriaItem(SearchCriteria criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

  /**
   * Get criteria
   * @return criteria
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SearchCriteria> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<SearchCriteria> criteria) {
    this.criteria = criteria;
  }

  public MealsSearch sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Get sortBy
   * @return sortBy
  **/
  @ApiModelProperty(value = "")


  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MealsSearch mealsSearch = (MealsSearch) o;
    return Objects.equals(this.criteria, mealsSearch.criteria) &&
        Objects.equals(this.sortBy, mealsSearch.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MealsSearch {\n");
    
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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

