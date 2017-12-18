package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallorder;
import com.microshop.servicedao.model.MallorderKey;

public interface MallorderMapper {
    int deleteByPrimaryKey(MallorderKey key);

    int insert(Mallorder record);

    int insertSelective(Mallorder record);

    Mallorder selectByPrimaryKey(MallorderKey key);

    int updateByPrimaryKeySelective(Mallorder record);

    int updateByPrimaryKey(Mallorder record);
}