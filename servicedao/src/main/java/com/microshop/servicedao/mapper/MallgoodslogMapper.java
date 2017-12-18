package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallgoodslog;

public interface MallgoodslogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallgoodslog record);

    int insertSelective(Mallgoodslog record);

    Mallgoodslog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallgoodslog record);

    int updateByPrimaryKey(Mallgoodslog record);
}