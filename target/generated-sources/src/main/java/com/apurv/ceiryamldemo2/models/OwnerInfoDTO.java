package com.apurv.ceiryamldemo2.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OwnerInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-03T16:54:08.275928900+05:30[Asia/Calcutta]")


public class OwnerInfoDTO   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("mobNumForOtp")
  private String mobNumForOtp = null;

  public OwnerInfoDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OwnerInfoDTO address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(description = "")
  
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public OwnerInfoDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(description = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OwnerInfoDTO mobNumForOtp(String mobNumForOtp) {
    this.mobNumForOtp = mobNumForOtp;
    return this;
  }

  /**
   * Get mobNumForOtp
   * @return mobNumForOtp
   **/
  @Schema(description = "")
  
    public String getMobNumForOtp() {
    return mobNumForOtp;
  }

  public void setMobNumForOtp(String mobNumForOtp) {
    this.mobNumForOtp = mobNumForOtp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerInfoDTO ownerInfoDTO = (OwnerInfoDTO) o;
    return Objects.equals(this.name, ownerInfoDTO.name) &&
        Objects.equals(this.address, ownerInfoDTO.address) &&
        Objects.equals(this.email, ownerInfoDTO.email) &&
        Objects.equals(this.mobNumForOtp, ownerInfoDTO.mobNumForOtp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, email, mobNumForOtp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerInfoDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobNumForOtp: ").append(toIndentedString(mobNumForOtp)).append("\n");
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
