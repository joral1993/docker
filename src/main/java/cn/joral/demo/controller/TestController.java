package cn.joral.demo.controller;

import cn.joral.demo.pojo.User;
import cn.joral.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangliang
 * @date 2020/5/16
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public User hello() {
        return testService.getUser();
    }
}
