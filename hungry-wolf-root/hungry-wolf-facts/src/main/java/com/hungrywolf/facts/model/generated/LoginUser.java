package com.hungrywolf.facts.model.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoginUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-03T01:23:28.090-07:00")

public class LoginUser   {
  @JsonProperty("loginUserId")
  private Integer loginUserId = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("passwordHash")
  private String passwordHash = null;

  @JsonProperty("salt")
  private String salt = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("lastLoggedIn")
  private String lastLoggedIn = null;

  public LoginUser loginUserId(Integer loginUserId) {
    this.loginUserId = loginUserId;
    return this;
  }

  /**
   * Get loginUserId
   * @return loginUserId
  **/
  @ApiModelProperty(value = "")


  public Integer getLoginUserId() {
    return loginUserId;
  }

  public void setLoginUserId(Integer loginUserId) {
    this.loginUserId = loginUserId;
  }

  public LoginUser username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public LoginUser passwordHash(String passwordHash) {
    this.passwordHash = passwordHash;
    return this;
  }

  /**
   * Get passwordHash
   * @return passwordHash
  **/
  @ApiModelProperty(value = "")


  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public LoginUser salt(String salt) {
    this.salt = salt;
    return this;
  }

  /**
   * Get salt
   * @return salt
  **/
  @ApiModelProperty(value = "")


  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public LoginUser userId(String userId) {
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

  public LoginUser lastLoggedIn(String lastLoggedIn) {
    this.lastLoggedIn = lastLoggedIn;
    return this;
  }

  /**
   * Get lastLoggedIn
   * @return lastLoggedIn
  **/
  @ApiModelProperty(value = "")


  public String getLastLoggedIn() {
    return lastLoggedIn;
  }

  public void setLastLoggedIn(String lastLoggedIn) {
    this.lastLoggedIn = lastLoggedIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginUser loginUser = (LoginUser) o;
    return Objects.equals(this.loginUserId, loginUser.loginUserId) &&
        Objects.equals(this.username, loginUser.username) &&
        Objects.equals(this.passwordHash, loginUser.passwordHash) &&
        Objects.equals(this.salt, loginUser.salt) &&
        Objects.equals(this.userId, loginUser.userId) &&
        Objects.equals(this.lastLoggedIn, loginUser.lastLoggedIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginUserId, username, passwordHash, salt, userId, lastLoggedIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginUser {\n");
    
    sb.append("    loginUserId: ").append(toIndentedString(loginUserId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lastLoggedIn: ").append(toIndentedString(lastLoggedIn)).append("\n");
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

