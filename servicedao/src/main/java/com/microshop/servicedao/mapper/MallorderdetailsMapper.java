package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallorderdetails;

public interface MallorderdetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallorderdetails record);

    int insertSelective(Mallorderdetails record);

    Mallorderdetails selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallorderdetails record);

    int updateByPrimaryKey(Mallorderdetails record);
}