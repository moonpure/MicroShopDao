package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallorderpaylog;

public interface MallorderpaylogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallorderpaylog record);

    int insertSelective(Mallorderpaylog record);

    Mallorderpaylog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallorderpaylog record);

    int updateByPrimaryKey(Mallorderpaylog record);
}