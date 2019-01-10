package cn.buildworld.springbootdemo;

/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/1/10
 */
public class ResultUtil {

    /**
     * 获取成功的情况
     * @param object
     * @return
     */
    public static Result success(Integer code,Object object){
        Result result = new Result();
        result.setCode(code);
        result.setMsg("成功");
        result.setData(object);

        return result;
    }

    /**
     * 获取失败的情况
     * @param object
     * @return
     */
    public static Result error(Integer code,Object object){
        Result result = new Result();
        result.setCode(code);
        result.setMsg("失败");
        result.setData(object);

        return result;
    }

}