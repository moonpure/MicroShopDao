package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallshoplog;

public interface MallshoplogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallshoplog record);

    int insertSelective(Mallshoplog record);

    Mallshoplog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallshoplog record);

    int updateByPrimaryKey(Mallshoplog record);
}