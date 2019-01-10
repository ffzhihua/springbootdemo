package cn.buildworld.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/1/10
 */
@Service
public class UserService {
    @Autowired
    private UserRespository userRespository;

    @Transactional(rollbackFor = Exception.class)
    public void insertTwo(){


    }


    public User getAge(Long id) throws Exception{
        User one = userRespository.findById(id).orElse(null);
        if(one != null &&one.getUserage() < 10){
            throw  new PersonException("你还在上小学吧", 100);
        }
        return one;
    }

}