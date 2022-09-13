package com.helen.delay.service.model.response;

import com.github.pagehelper.PageInfo;
import com.helen.delay.service.model.People;
import com.helen.delay.shared.domain.base.PageResult;
import com.helen.delay.shared.domain.vo.PeopleListVo;
import com.helen.delay.shared.enums.ResultCodeEnum;
import lombok.Data;

/**
 * @Author: 樊喆
 */
@Data
public class Result<T> {

    Integer code;

    T data;

    String message;

    public Result(){}

    public static <T> Result<T> build(T body, Integer code, String message) {
        Result<T> result = new Result<T>();
        if (body != null) {
            result.setData(body);
        }
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    /**
     * 操作成功
     * @param data  baseCategory1List
     * @param <T>
     * @return
     */
    public static<T> Result<T> ok(T data){
        return build(data, ResultCodeEnum.SUCCESS.getCode(),"成功");
    }

    public static<T> Result<T> ok(){
        return Result.ok(null);
    }

    /**
     * 操作失败
     * @param data
     * @param <T>
     * @return
     */
    public static<T> Result<T> fail(T data){
        return build(data, ResultCodeEnum.FAIL.getCode(), "失败");
    }

    public static<T> Result<T> fail(){
        return Result.fail(null);
    }

    public Result<T> message(String msg){
        this.setMessage(msg);
        return this;
    }

    public Result<T> code(Integer code){
        this.setCode(code);
        return this;
    }
}
