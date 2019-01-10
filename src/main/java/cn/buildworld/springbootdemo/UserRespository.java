package cn.buildworld.springbootdemo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description:dao层接口
 * @Author: zhihua
 * @Date: 2019/1/9
 */
public interface UserRespository extends JpaRepository<User,Long> {
    /**
     *
     * @param age
     * @return
     */
    public List<User> findByUserage(Integer age);
}