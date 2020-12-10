package cn.joral.demo.service.impl;

import cn.joral.demo.dao.UserDo;
import cn.joral.demo.pojo.User;
import cn.joral.demo.service.TestService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangliang
 * @date 2020/12/9
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserDo userDo;

    @Override
    public User getUser() {
        return userDo.selectById(1327145691025276929L);
    }
}
