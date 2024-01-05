package com.apurv.ceiryamldemo2.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LostInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-03T16:54:08.275928900+05:30[Asia/Calcutta]")


public class LostInfoDTO   {
  @JsonProperty("lostPlace")
  private String lostPlace = null;

  @JsonProperty("lostDate")
  private String lostDate = null;

  @JsonProperty("lostState")
  private String lostState = null;

  @JsonProperty("lostDistrict")
  private String lostDistrict = null;

  @JsonProperty("lostPoliceStation")
  private String lostPoliceStation = null;

  @JsonProperty("policeComplaintNum")
  private String policeComplaintNum = null;

  public LostInfoDTO lostPlace(String lostPlace) {
    this.lostPlace = lostPlace;
    return this;
  }

  /**
   * Get lostPlace
   * @return lostPlace
   **/
  @Schema(description = "")
  
    public String getLostPlace() {
    return lostPlace;
  }

  public void setLostPlace(String lostPlace) {
    this.lostPlace = lostPlace;
  }

  public LostInfoDTO lostDate(String lostDate) {
    this.lostDate = lostDate;
    return this;
  }

  /**
   * Get lostDate
   * @return lostDate
   **/
  @Schema(description = "")
  
    public String getLostDate() {
    return lostDate;
  }

  public void setLostDate(String lostDate) {
    this.lostDate = lostDate;
  }

  public LostInfoDTO lostState(String lostState) {
    this.lostState = lostState;
    return this;
  }

  /**
   * Get lostState
   * @return lostState
   **/
  @Schema(description = "")
  
    public String getLostState() {
    return lostState;
  }

  public void setLostState(String lostState) {
    this.lostState = lostState;
  }

  public LostInfoDTO lostDistrict(String lostDistrict) {
    this.lostDistrict = lostDistrict;
    return this;
  }

  /**
   * Get lostDistrict
   * @return lostDistrict
   **/
  @Schema(description = "")
  
    public String getLostDistrict() {
    return lostDistrict;
  }

  public void setLostDistrict(String lostDistrict) {
    this.lostDistrict = lostDistrict;
  }

  public LostInfoDTO lostPoliceStation(String lostPoliceStation) {
    this.lostPoliceStation = lostPoliceStation;
    return this;
  }

  /**
   * Get lostPoliceStation
   * @return lostPoliceStation
   **/
  @Schema(description = "")
  
    public String getLostPoliceStation() {
    return lostPoliceStation;
  }

  public void setLostPoliceStation(String lostPoliceStation) {
    this.lostPoliceStation = lostPoliceStation;
  }

  public LostInfoDTO policeComplaintNum(String policeComplaintNum) {
    this.policeComplaintNum = policeComplaintNum;
    return this;
  }

  /**
   * Get policeComplaintNum
   * @return policeComplaintNum
   **/
  @Schema(description = "")
  
    public String getPoliceComplaintNum() {
    return policeComplaintNum;
  }

  public void setPoliceComplaintNum(String policeComplaintNum) {
    this.policeComplaintNum = policeComplaintNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LostInfoDTO lostInfoDTO = (LostInfoDTO) o;
    return Objects.equals(this.lostPlace, lostInfoDTO.lostPlace) &&
        Objects.equals(this.lostDate, lostInfoDTO.lostDate) &&
        Objects.equals(this.lostState, lostInfoDTO.lostState) &&
        Objects.equals(this.lostDistrict, lostInfoDTO.lostDistrict) &&
        Objects.equals(this.lostPoliceStation, lostInfoDTO.lostPoliceStation) &&
        Objects.equals(this.policeComplaintNum, lostInfoDTO.policeComplaintNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lostPlace, lostDate, lostState, lostDistrict, lostPoliceStation, policeComplaintNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LostInfoDTO {\n");
    
    sb.append("    lostPlace: ").append(toIndentedString(lostPlace)).append("\n");
    sb.append("    lostDate: ").append(toIndentedString(lostDate)).append("\n");
    sb.append("    lostState: ").append(toIndentedString(lostState)).append("\n");
    sb.append("    lostDistrict: ").append(toIndentedString(lostDistrict)).append("\n");
    sb.append("    lostPoliceStation: ").append(toIndentedString(lostPoliceStation)).append("\n");
    sb.append("    policeComplaintNum: ").append(toIndentedString(policeComplaintNum)).append("\n");
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
