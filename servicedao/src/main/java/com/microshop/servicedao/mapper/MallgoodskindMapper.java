package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallgoodskind;

public interface MallgoodskindMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallgoodskind record);

    int insertSelective(Mallgoodskind record);

    Mallgoodskind selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallgoodskind record);

    int updateByPrimaryKey(Mallgoodskind record);
}