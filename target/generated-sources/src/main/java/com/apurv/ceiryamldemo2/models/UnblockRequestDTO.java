package com.apurv.ceiryamldemo2.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains Unblock Request Details
 */
@Schema(description = "Contains Unblock Request Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-03T16:54:08.275928900+05:30[Asia/Calcutta]")


public class UnblockRequestDTO   {
  @JsonProperty("requestId")
  private Integer requestId = null;

  @JsonProperty("mobNumForOtp")
  private String mobNumForOtp = null;

  @JsonProperty("reasonForUnblock")
  private String reasonForUnblock = null;

  public UnblockRequestDTO requestId(Integer requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Get requestId
   * @return requestId
   **/
  @Schema(description = "")
  
    public Integer getRequestId() {
    return requestId;
  }

  public void setRequestId(Integer requestId) {
    this.requestId = requestId;
  }

  public UnblockRequestDTO mobNumForOtp(String mobNumForOtp) {
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

  public UnblockRequestDTO reasonForUnblock(String reasonForUnblock) {
    this.reasonForUnblock = reasonForUnblock;
    return this;
  }

  /**
   * Get reasonForUnblock
   * @return reasonForUnblock
   **/
  @Schema(description = "")
  
    public String getReasonForUnblock() {
    return reasonForUnblock;
  }

  public void setReasonForUnblock(String reasonForUnblock) {
    this.reasonForUnblock = reasonForUnblock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnblockRequestDTO unblockRequestDTO = (UnblockRequestDTO) o;
    return Objects.equals(this.requestId, unblockRequestDTO.requestId) &&
        Objects.equals(this.mobNumForOtp, unblockRequestDTO.mobNumForOtp) &&
        Objects.equals(this.reasonForUnblock, unblockRequestDTO.reasonForUnblock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, mobNumForOtp, reasonForUnblock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnblockRequestDTO {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    mobNumForOtp: ").append(toIndentedString(mobNumForOtp)).append("\n");
    sb.append("    reasonForUnblock: ").append(toIndentedString(reasonForUnblock)).append("\n");
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
