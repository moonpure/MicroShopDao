package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallshoplicense;

public interface MallshoplicenseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallshoplicense record);

    int insertSelective(Mallshoplicense record);

    Mallshoplicense selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallshoplicense record);

    int updateByPrimaryKey(Mallshoplicense record);
}