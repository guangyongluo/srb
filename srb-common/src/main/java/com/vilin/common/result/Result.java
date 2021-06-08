package com.vilin.common.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Result {
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    private Result() {
    }

    /**
     * 返回成功结果
     *
     * @return
     */
    public static Result ok() {
        Result result = new Result();
        result.setCode(ResponseEnum.SUCCESS.getCode());
        result.setMessage(ResponseEnum.SUCCESS.getMessage());
        return result;
    }

    /**
     * 返回失败结果
     *
     * @return
     */
    public static Result error() {
        Result result = new Result();
        result.setCode(ResponseEnum.ERROR.getCode());
        result.setMessage(ResponseEnum.ERROR.getMessage());
        return result;
    }

    /**
     * 设置特定的结果
     *
     * @param responseEnum
     * @return
     */
    public static Result setResult(ResponseEnum responseEnum) {
        Result result = new Result();
        result.setCode(responseEnum.getCode());
        result.setMessage(responseEnum.getMessage());
        return result;
    }

    /**
     * 设置统一返回中的code属性
     * @param code
     * @return
     */
    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    /**
     * 设置统一返回中的data属性
     * @param key
     * @param value
     * @return
     */
    public Result data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    /**
     * 设置统一返回中的data属性
     * @param map
     * @return
     */
    public Result data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

    /**
     * 设置统一返回中的message属性
     * @param message
     * @return
     */
    public Result message(String message){
        this.setMessage(message);
        return this;
    }

}
