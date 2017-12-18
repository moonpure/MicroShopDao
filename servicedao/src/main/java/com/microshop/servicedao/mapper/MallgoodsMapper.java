package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallgoods;

public interface MallgoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallgoods record);

    int insertSelective(Mallgoods record);

    Mallgoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallgoods record);

    int updateByPrimaryKey(Mallgoods record);
}