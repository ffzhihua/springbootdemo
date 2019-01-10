package cn.buildworld.springbootdemo;

/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/1/10
 */
public class Result<T> {

    private Integer code;
    private String msg;

    private T data;

    public void setCode(Integer code){
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}