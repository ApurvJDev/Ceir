package com.apurv.ceiryamldemo2.service;

import com.apurv.ceiryamldemo2.entity.InternalRequest;
import com.apurv.ceiryamldemo2.repository.CeirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnblockService {

    @Autowired
    private CeirRepository ceirRepository;

    public void delete(InternalRequest request){
        ceirRepository.delete(request);
    }
}
