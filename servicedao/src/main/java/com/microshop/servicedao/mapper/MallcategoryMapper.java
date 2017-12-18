package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallcategory;

public interface MallcategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mallcategory record);

    int insertSelective(Mallcategory record);

    Mallcategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mallcategory record);

    int updateByPrimaryKey(Mallcategory record);
}