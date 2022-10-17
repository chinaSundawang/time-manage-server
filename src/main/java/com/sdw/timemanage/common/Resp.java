package com.sdw.timemanage.common;

import com.alibaba.fastjson.JSON;
import com.sdw.timemanage.common.constant.Constant;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sdw
 */

@Data
public class Resp<T> implements Serializable {

    private Integer status;
    private Integer code;
    private String message;
    private T data;

    public Resp() {
    }

    private Resp(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    private Resp(Integer status, String message, T data) {
        this.status = status;
        this.code= Constant.RespStatus.SUCCESS.getCode();
        this.message = message;
        this.data = data;
    }
    private Resp(Integer status, Integer code, String message, T data) {
        this.status = status;
        this.code=code;
        this.message = message;
        this.data = data;
    }

    public static Resp success(String message, Object data) {
        return new Resp<>(Constant.RespStatus.SUCCESS.getCode(), message, data);
    }

    public static Resp success(Object data) {
        return new Resp<>(Constant.RespStatus.SUCCESS.getCode(),Constant.RespStatus.SUCCESS.getCode(), "success", data);
    }
    public static Resp success() {
        return new Resp<>(Constant.RespStatus.SUCCESS.getCode(),Constant.RespStatus.SUCCESS.getCode(), "success", "");
    }

    public static Resp fail(Integer status, String message, Object data) {
        return new Resp<>(status, message, data);
    }

    public static Resp fail(Integer status, String message) {
        return new Resp<>(status, message);
    }

    public static Resp fail(String message) {
        return new Resp<>(Constant.RespStatus.FAIL.getCode(), message);
    }

    public static Resp parameError() {
        return new Resp<>(Constant.RespStatus.FAIL.getCode(), "参数错误");
    }

    public static Resp error() {
        return new Resp<>(Constant.RespStatus.ERROR.getCode(), "系统繁忙，请稍后再试");
    }

    /**
     * 根据code 判断成功还是失败
     * @param i
     * @param failMsg
     * @return
     */
    public static Resp byCode(int i, String failMsg) {
        if (i > 0) {
            return success("ok", null);
        } else {
            return fail(Constant.RespStatus.FAIL.getCode(), failMsg);
        }
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
