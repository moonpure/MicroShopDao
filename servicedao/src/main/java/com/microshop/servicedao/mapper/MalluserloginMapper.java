package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Malluserlogin;

public interface MalluserloginMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Malluserlogin record);

    int insertSelective(Malluserlogin record);

    Malluserlogin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Malluserlogin record);

    int updateByPrimaryKey(Malluserlogin record);
}