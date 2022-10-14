package com.sdw.timemanage.mapper;

import com.sdw.timemanage.pojo.TimeManageRecord;

public interface TimeManageRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TimeManageRecord record);

    int insertSelective(TimeManageRecord record);

    TimeManageRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TimeManageRecord record);

    int updateByPrimaryKeyWithBLOBs(TimeManageRecord record);

    int updateByPrimaryKey(TimeManageRecord record);
}