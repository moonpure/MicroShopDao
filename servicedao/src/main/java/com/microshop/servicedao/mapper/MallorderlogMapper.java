package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallorderlog;

public interface MallorderlogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallorderlog record);

    int insertSelective(Mallorderlog record);

    Mallorderlog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallorderlog record);

    int updateByPrimaryKey(Mallorderlog record);
}