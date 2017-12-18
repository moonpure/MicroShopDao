package com.microshop.servicedao.mapper;

import com.microshop.servicedao.model.Mallgoodspicture;

public interface MallgoodspictureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallgoodspicture record);

    int insertSelective(Mallgoodspicture record);

    Mallgoodspicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallgoodspicture record);

    int updateByPrimaryKey(Mallgoodspicture record);
}