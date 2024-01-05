package com.apurv.ceiryamldemo2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class InternalRequest {

    @Id
    private int requestId;
    private String deviceMobNum1;
//    private String deviceMobNum2;
    private String imei1;
//    private String imei2;
//    private String deviceBrand;
//    private String deviceModel;
//    private String name;
//    private String address;
//    private String email;
    private String mobNumForOtp;
//    private String lostPlace;
//    private String lostDate;
//    private String lostState;
//    private String lostDistrict;
//    private String lostPoliceStation;
//    private String lostComplaintNum;
//    private String reasonForUnblock;

//    public InternalRequest(UnblockRequestDTO unblock) {
//
//    }

//    public String getDeviceMobNum2() {
//        return deviceMobNum2;
//    }

//    public void setDeviceMobNum2(String deviceMobNum2) {
//        this.deviceMobNum2 = deviceMobNum2;
//    }

//    public String getImei2() {
//        return imei2;
//    }

//    public void setImei2(String imei2) {
//        this.imei2 = imei2;
//    }

//    public String getDeviceBrand() {
//        return deviceBrand;
//    }
//
//    public void setDeviceBrand(String deviceBrand) {
//        this.deviceBrand = deviceBrand;
//    }
//
//    public String getDeviceModel() {
//        return deviceModel;
//    }
//
//    public void setDeviceModel(String deviceModel) {
//        this.deviceModel = deviceModel;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getLostPlace() {
//        return lostPlace;
//    }
//
//    public void setLostPlace(String lostPlace) {
//        this.lostPlace = lostPlace;
//    }
//
//    public String getLostDate() {
//        return lostDate;
//    }
//
//    public void setLostDate(String lostDate) {
//        this.lostDate = lostDate;
//    }
//
//    public String getLostState() {
//        return lostState;
//    }
//
//    public void setLostState(String lostState) {
//        this.lostState = lostState;
//    }
//
//    public String getLostDistrict() {
//        return lostDistrict;
//    }
//
//    public void setLostDistrict(String lostDistrict) {
//        this.lostDistrict = lostDistrict;
//    }
//
//    public String getLostPoliceStation() {
//        return lostPoliceStation;
//    }
//
//    public void setLostPoliceStation(String lostPoliceStation) {
//        this.lostPoliceStation = lostPoliceStation;
//    }
//
//    public String getLostComplaintNum() {
//        return lostComplaintNum;
//    }
//
//    public void setLostComplaintNum(String lostComplaintNum) {
//        this.lostComplaintNum = lostComplaintNum;
//    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getDeviceMobNum1() {
        return deviceMobNum1;
    }

    public void setDeviceMobNum1(String deviceMobNum1) {
        this.deviceMobNum1 = deviceMobNum1;
    }

    public String getImei1() {
        return imei1;
    }

    public void setImei1(String imei1) {
        this.imei1 = imei1;
    }

    public String getMobNumForOtp() {
        return mobNumForOtp;
    }

    public void setMobNumForOtp(String mobNumForOtp) {
        this.mobNumForOtp = mobNumForOtp;
    }

//    public String getReasonForUnblock() {
//        return reasonForUnblock;
//    }

//    public void setReasonForUnblock(String reasonForUnblock) {
//        this.reasonForUnblock = reasonForUnblock;
//    }
}
