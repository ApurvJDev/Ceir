package com.apurv.ceiryamldemo2.mapper;

import com.apurv.ceiryamldemo2.entity.InternalRequest;
import com.apurv.ceiryamldemo2.models.BlockRequestDTO;
import com.apurv.ceiryamldemo2.models.UnblockRequestDTO;
import org.springframework.stereotype.Repository;
import java.util.Random;

@Repository
public class Mapper {
    public int getRandomNum(){
        Random random = new Random();
        return random.nextInt(999999);
    }

    public InternalRequest mapBlockToInternalRequest(BlockRequestDTO block) {

        InternalRequest internalRequest = new InternalRequest();

        internalRequest.setRequestId(getRandomNum());

        internalRequest.setDeviceMobNum1(block.getDeviceInfoDTO().getDeviceMobNum1());

        internalRequest.setImei1(block.getDeviceInfoDTO().getImei1());

        internalRequest.setMobNumForOtp(block.getOwnerInfoDTO().getMobNumForOtp());

        return internalRequest;
    }

    public InternalRequest mapUnblockToInternalRequest(UnblockRequestDTO unblock){

        InternalRequest internalRequest = new InternalRequest();

        internalRequest.setRequestId(unblock.getRequestId());
        internalRequest.setMobNumForOtp(unblock.getMobNumForOtp());

        return internalRequest;
    }
}
