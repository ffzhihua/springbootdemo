package cn.buildworld.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;


/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/1/9
 */
@RestController
public class UserController {

    @Autowired
    private UserRespository userRespository;
    @Autowired
    private UserService userService;

    @GetMapping("getInfo")
    public List<User> getInfo() {

        List<User> all = userRespository.findAll();
        return all;
    }

    /**
     * POST方式
     *
     * @return
     */
    @PostMapping(value = "getInfo")
    public String getInfoByPost() {
        return "请使用get方式！";
    }

    @PostMapping(value = "adduser")
    public User addUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        userRespository.save(user);
        return user;
    }

    @GetMapping(value = "user/{id}")
    public User checkUser(@PathVariable("id") Long id) {
        return userRespository.findById(id).orElse(null);
    }

    @PutMapping("user/{id}")
    public User updateUser(@PathVariable("id") Long id, User user) {
        user.setId(id);
        userRespository.save(user);
        return userRespository.findById(id).orElse(null);

    }

    /**
     * DELETE方式删除一个用户
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "user/{id}")
    public List<User> deleteUser(@PathVariable("id") Long id) {
        userRespository.deleteById(id);
        return userRespository.findAll();
    }

    /**
     * 通过年龄来查询用户信息
     *
     * @param age
     * @return
     */
    @GetMapping(value = "user/age/{age}")
    public List<User> findUserByAge(@PathVariable("age") int age) {
        return userRespository.findByUserage(age);
    }


    /**
     * 通过ID来查询用户年龄
     *
     * @param id
     * @return
     */
    @GetMapping(value = "user/getage/{id}")
    public User findUserByAge(@PathVariable("id") Long id) throws Exception {
        return userService.getAge(id);
    }

}