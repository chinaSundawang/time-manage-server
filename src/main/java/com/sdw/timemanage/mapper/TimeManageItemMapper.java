package com.sdw.timemanage.mapper;

import com.sdw.timemanage.pojo.TimeManageItem;

public interface TimeManageItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TimeManageItem record);

    int insertSelective(TimeManageItem record);

    TimeManageItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TimeManageItem record);

    int updateByPrimaryKey(TimeManageItem record);
}