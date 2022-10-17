package com.sdw.timemanage.service.impl;

import com.sdw.timemanage.mapper.TimeManageItemMapper;
import com.sdw.timemanage.pojo.TimeManageItem;
import com.sdw.timemanage.service.TimeManageService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author sdw
 */
@Service
public class TimeManageServiceImpl implements TimeManageService {

    private final TimeManageItemMapper timeManageItemMapper;

    public TimeManageServiceImpl(TimeManageItemMapper timeManageItemMapper) {
        this.timeManageItemMapper = timeManageItemMapper;
    }

    @Override
    public void addItem(String name, String desc) {
        TimeManageItem timeManageItem = new TimeManageItem();
        timeManageItem.setName(name);
        timeManageItem.setDescribes(desc);
        timeManageItem.setIsDel(Byte.valueOf("0"));
        timeManageItem.setCreateTime(new Date());
        timeManageItem.setUpdateTime(new Date());

        timeManageItemMapper.insertSelective(timeManageItem);
    }
}
