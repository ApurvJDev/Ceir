package com.apurv.ceiryamldemo2.controller;

import com.apurv.ceiryamldemo2.api.BlockRequestApi;
import com.apurv.ceiryamldemo2.api.UnblockRequestApi;
import com.apurv.ceiryamldemo2.entity.InternalRequest;
import com.apurv.ceiryamldemo2.mapper.Mapper;
import com.apurv.ceiryamldemo2.models.BlockRequestDTO;
import com.apurv.ceiryamldemo2.models.UnblockRequestDTO;
import com.apurv.ceiryamldemo2.service.BlockService;
import com.apurv.ceiryamldemo2.service.UnblockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements BlockRequestApi, UnblockRequestApi {

//    private final static String PATH = "/error";
//
//    @RequestMapping(PATH)
//    @ResponseBody
//    public String getErrorPath() {
//        Exception e = new Exception();
//        return e.getMessage();
//    }

    @Autowired
    Mapper mapper;
    @Autowired
    BlockService blockService;
    @Autowired
    UnblockService unblockService;


    @Override
    public ResponseEntity<String> blockRequest(BlockRequestDTO blockRequestDTO) {
        try {
            if(blockRequestDTO != null) {
                InternalRequest internalRequest = mapper.mapBlockToInternalRequest(blockRequestDTO);
                blockService.save(internalRequest);

                String response = "Mobile Number :  " + blockRequestDTO.getDeviceInfoDTO().getDeviceMobNum1()
                        + "\n"
                        + " With Imei : " + blockRequestDTO.getDeviceInfoDTO().getImei1()
                        + "\n"
                        + " blocked with Request ID: " + internalRequest.getRequestId();
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
            else {
                String response = "Invalid request";
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        }
        catch (Exception e) {
            String response = "Exception occurred : " + e.getMessage();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<String> unblockRequest(UnblockRequestDTO unblockRequestDTO) {
        if(unblockRequestDTO != null) {

            InternalRequest internalRequest = mapper.mapUnblockToInternalRequest(unblockRequestDTO);
            unblockService.delete(internalRequest);

            String response = "Device with Request Id : " + unblockRequestDTO.getRequestId()
                            + "\n"
                            + " unblocked successfully";

            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        else {
            String response = "Invalid request";
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }
}
