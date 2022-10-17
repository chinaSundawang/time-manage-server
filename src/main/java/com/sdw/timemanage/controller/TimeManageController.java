package com.sdw.timemanage.controller;

import com.sdw.timemanage.common.Resp;
import com.sdw.timemanage.service.TimeManageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sdw
 */
@RestController
@RequestMapping("/item")
@Slf4j
public class TimeManageController {

    private final TimeManageService timeManageService;

    public TimeManageController(TimeManageService timeManageService) {
        this.timeManageService = timeManageService;
    }

    @PostMapping("/addItem")
    public Resp addItem(String name,String desc){
        timeManageService.addItem(name,desc);
        return Resp.success();
    }
}
