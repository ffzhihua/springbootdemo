package cn.buildworld.springbootdemo;

import org.springframework.web.bind.annotation.ControllerAdvice;

import cn.buildworld.springbootdemo.Result;
import cn.buildworld.springbootdemo.ResultUtil;


/**
 * @Description:捕获异常
 * @Author: zhihua
 * @Date: 2019/1/10
 */
@ControllerAdvice
public class ExceptionHandle {

    public Result ExceptionHandle(Exception e){

        if (e instanceof PersonException){
            PersonException personException = (PersonException) e;
            return ResultUtil.error(personException.getCode(),personException.getMessage());
        }
        return ResultUtil.error(-1,e.getMessage());
    }
}