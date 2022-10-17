package com.sdw.timemanage.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 项表
 */
@Data
public class TimeManageItem implements Serializable {
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String describes;

    /**
     * 是否删除 0未删除 1已删除
     */
    private Byte isDel;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private static final long serialVersionUID = 1L;
}