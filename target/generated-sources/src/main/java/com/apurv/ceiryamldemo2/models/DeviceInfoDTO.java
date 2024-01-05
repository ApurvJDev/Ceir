package com.apurv.ceiryamldemo2.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeviceInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-03T16:54:08.275928900+05:30[Asia/Calcutta]")


public class DeviceInfoDTO   {
  @JsonProperty("deviceMobNum1")
  private String deviceMobNum1 = null;

  @JsonProperty("deviceMobNum2")
  private String deviceMobNum2 = null;

  @JsonProperty("imei1")
  private String imei1 = null;

  @JsonProperty("imei2")
  private String imei2 = null;

  @JsonProperty("deviceBrand")
  private String deviceBrand = null;

  @JsonProperty("deviceModel")
  private String deviceModel = null;

  public DeviceInfoDTO deviceMobNum1(String deviceMobNum1) {
    this.deviceMobNum1 = deviceMobNum1;
    return this;
  }

  /**
   * Get deviceMobNum1
   * @return deviceMobNum1
   **/
  @Schema(description = "")
  
    public String getDeviceMobNum1() {
    return deviceMobNum1;
  }

  public void setDeviceMobNum1(String deviceMobNum1) {
    this.deviceMobNum1 = deviceMobNum1;
  }

  public DeviceInfoDTO deviceMobNum2(String deviceMobNum2) {
    this.deviceMobNum2 = deviceMobNum2;
    return this;
  }

  /**
   * Get deviceMobNum2
   * @return deviceMobNum2
   **/
  @Schema(description = "")
  
    public String getDeviceMobNum2() {
    return deviceMobNum2;
  }

  public void setDeviceMobNum2(String deviceMobNum2) {
    this.deviceMobNum2 = deviceMobNum2;
  }

  public DeviceInfoDTO imei1(String imei1) {
    this.imei1 = imei1;
    return this;
  }

  /**
   * Get imei1
   * @return imei1
   **/
  @Schema(description = "")
  
    public String getImei1() {
    return imei1;
  }

  public void setImei1(String imei1) {
    this.imei1 = imei1;
  }

  public DeviceInfoDTO imei2(String imei2) {
    this.imei2 = imei2;
    return this;
  }

  /**
   * Get imei2
   * @return imei2
   **/
  @Schema(description = "")
  
    public String getImei2() {
    return imei2;
  }

  public void setImei2(String imei2) {
    this.imei2 = imei2;
  }

  public DeviceInfoDTO deviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

  /**
   * Get deviceBrand
   * @return deviceBrand
   **/
  @Schema(description = "")
  
    public String getDeviceBrand() {
    return deviceBrand;
  }

  public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  public DeviceInfoDTO deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

  /**
   * Get deviceModel
   * @return deviceModel
   **/
  @Schema(description = "")
  
    public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInfoDTO deviceInfoDTO = (DeviceInfoDTO) o;
    return Objects.equals(this.deviceMobNum1, deviceInfoDTO.deviceMobNum1) &&
        Objects.equals(this.deviceMobNum2, deviceInfoDTO.deviceMobNum2) &&
        Objects.equals(this.imei1, deviceInfoDTO.imei1) &&
        Objects.equals(this.imei2, deviceInfoDTO.imei2) &&
        Objects.equals(this.deviceBrand, deviceInfoDTO.deviceBrand) &&
        Objects.equals(this.deviceModel, deviceInfoDTO.deviceModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceMobNum1, deviceMobNum2, imei1, imei2, deviceBrand, deviceModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInfoDTO {\n");
    
    sb.append("    deviceMobNum1: ").append(toIndentedString(deviceMobNum1)).append("\n");
    sb.append("    deviceMobNum2: ").append(toIndentedString(deviceMobNum2)).append("\n");
    sb.append("    imei1: ").append(toIndentedString(imei1)).append("\n");
    sb.append("    imei2: ").append(toIndentedString(imei2)).append("\n");
    sb.append("    deviceBrand: ").append(toIndentedString(deviceBrand)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
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
