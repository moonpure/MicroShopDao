package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallshopdetails;

public interface MallshopdetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallshopdetails record);

    int insertSelective(Mallshopdetails record);

    Mallshopdetails selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallshopdetails record);

    int updateByPrimaryKey(Mallshopdetails record);
}