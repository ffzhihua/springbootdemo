package cn.buildworld.springbootdemo;

import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @Description:用户类
 * @Author: zhihua
 * @Date: 2019/1/9
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;

    @Min(value = 18,message = "未成年禁止注册")
    private int userage;


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public int getUserage(){
        return userage;
    }

    public void setUserage(int userage){
        this.userage = userage;
    }


}