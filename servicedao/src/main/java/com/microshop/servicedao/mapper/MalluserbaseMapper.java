package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Malluserbase;

public interface MalluserbaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Malluserbase record);

    int insertSelective(Malluserbase record);

    Malluserbase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Malluserbase record);

    int updateByPrimaryKey(Malluserbase record);
}