package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallorderpay;

public interface MallorderpayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallorderpay record);

    int insertSelective(Mallorderpay record);

    Mallorderpay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallorderpay record);

    int updateByPrimaryKey(Mallorderpay record);
}