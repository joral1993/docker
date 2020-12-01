package cn.joral.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangliang
 * @date 2020/5/16
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "hello word";
    }
}
