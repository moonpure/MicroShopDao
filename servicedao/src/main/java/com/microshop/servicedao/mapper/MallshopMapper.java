package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallshop;

public interface MallshopMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallshop record);

    int insertSelective(Mallshop record);

    Mallshop selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallshop record);

    int updateByPrimaryKey(Mallshop record);
}