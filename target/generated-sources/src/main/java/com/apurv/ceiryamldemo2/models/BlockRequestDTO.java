package com.apurv.ceiryamldemo2.models;

import java.util.Objects;
import com.apurv.ceiryamldemo2.models.DeviceInfoDTO;
import com.apurv.ceiryamldemo2.models.LostInfoDTO;
import com.apurv.ceiryamldemo2.models.OwnerInfoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains Device information and User information and Lost information
 */
@Schema(description = "Contains Device information and User information and Lost information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-03T16:54:08.275928900+05:30[Asia/Calcutta]")


public class BlockRequestDTO   {
  @JsonProperty("deviceInfoDTO")
  private DeviceInfoDTO deviceInfoDTO = null;

  @JsonProperty("lostInfoDTO")
  private LostInfoDTO lostInfoDTO = null;

  @JsonProperty("ownerInfoDTO")
  private OwnerInfoDTO ownerInfoDTO = null;

  public BlockRequestDTO deviceInfoDTO(DeviceInfoDTO deviceInfoDTO) {
    this.deviceInfoDTO = deviceInfoDTO;
    return this;
  }

  /**
   * Get deviceInfoDTO
   * @return deviceInfoDTO
   **/
  @Schema(description = "")
  
    @Valid
    public DeviceInfoDTO getDeviceInfoDTO() {
    return deviceInfoDTO;
  }

  public void setDeviceInfoDTO(DeviceInfoDTO deviceInfoDTO) {
    this.deviceInfoDTO = deviceInfoDTO;
  }

  public BlockRequestDTO lostInfoDTO(LostInfoDTO lostInfoDTO) {
    this.lostInfoDTO = lostInfoDTO;
    return this;
  }

  /**
   * Get lostInfoDTO
   * @return lostInfoDTO
   **/
  @Schema(description = "")
  
    @Valid
    public LostInfoDTO getLostInfoDTO() {
    return lostInfoDTO;
  }

  public void setLostInfoDTO(LostInfoDTO lostInfoDTO) {
    this.lostInfoDTO = lostInfoDTO;
  }

  public BlockRequestDTO ownerInfoDTO(OwnerInfoDTO ownerInfoDTO) {
    this.ownerInfoDTO = ownerInfoDTO;
    return this;
  }

  /**
   * Get ownerInfoDTO
   * @return ownerInfoDTO
   **/
  @Schema(description = "")
  
    @Valid
    public OwnerInfoDTO getOwnerInfoDTO() {
    return ownerInfoDTO;
  }

  public void setOwnerInfoDTO(OwnerInfoDTO ownerInfoDTO) {
    this.ownerInfoDTO = ownerInfoDTO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockRequestDTO blockRequestDTO = (BlockRequestDTO) o;
    return Objects.equals(this.deviceInfoDTO, blockRequestDTO.deviceInfoDTO) &&
        Objects.equals(this.lostInfoDTO, blockRequestDTO.lostInfoDTO) &&
        Objects.equals(this.ownerInfoDTO, blockRequestDTO.ownerInfoDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceInfoDTO, lostInfoDTO, ownerInfoDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockRequestDTO {\n");
    
    sb.append("    deviceInfoDTO: ").append(toIndentedString(deviceInfoDTO)).append("\n");
    sb.append("    lostInfoDTO: ").append(toIndentedString(lostInfoDTO)).append("\n");
    sb.append("    ownerInfoDTO: ").append(toIndentedString(ownerInfoDTO)).append("\n");
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
