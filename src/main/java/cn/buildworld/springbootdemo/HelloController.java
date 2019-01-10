package cn.buildworld.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping("demo")
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;
    @Value("${info}")
    private String info;

    @Autowired
    private Person person;

    @RequestMapping(value = "say", method = RequestMethod.GET)
    public String say() {
        return "Hello Spring Boot!";
    }

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info() {
        return "姓名：" + person.getName() + " 年龄：" + person.getAge();
    }

    @RequestMapping(value = "info2Json", method = RequestMethod.GET)
    public Person info2Json() {
        return person;
    }

    @RequestMapping(value = "value/{value}", method = RequestMethod.GET)
    public int info2Restful(@PathVariable(value = "value", required = false) int value) {
        return value;
    }


    @RequestMapping(value = "value", method = RequestMethod.GET)
    public int getValue(@RequestParam(value = "id", required = false, defaultValue = "0") int value) {
        return value;
    }

}
