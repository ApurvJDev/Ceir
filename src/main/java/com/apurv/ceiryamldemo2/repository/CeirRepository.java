package com.apurv.ceiryamldemo2.repository;

import com.apurv.ceiryamldemo2.entity.InternalRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CeirRepository extends JpaRepository<InternalRequest, Integer> {

}
