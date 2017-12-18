package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallbanner;

public interface MallbannerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mallbanner record);

    int insertSelective(Mallbanner record);

    Mallbanner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mallbanner record);

    int updateByPrimaryKey(Mallbanner record);
}