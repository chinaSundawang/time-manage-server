package com.sdw.timemanage.mapper;

import com.sdw.timemanage.pojo.TimeManageItem;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeManageItemMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(TimeManageItem record);

    TimeManageItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TimeManageItem record);
}