package com.ymslx.nkbigdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ymslx.nkbigdata.entity.AreaAdditionalInfo;

@Repository
public interface AreaAdditionalInfoRepository extends JpaRepository<AreaAdditionalInfo, String> {

}