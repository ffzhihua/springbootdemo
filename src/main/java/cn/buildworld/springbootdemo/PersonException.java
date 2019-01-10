package cn.buildworld.springbootdemo;


/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/1/10
 */

public class PersonException extends RuntimeException{

    private Integer code;

    public PersonException(String message,Integer code){
        super(message);
        this.code = code;
    }

    public Integer getCode(){

        return code;
    }

    public void setCode(Integer code){
        this.code = code;
    }
}