package cn.joral.demo.dao;

import cn.joral.demo.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jiangliang
 * @date 2020/12/9
 */
@Mapper
public interface UserDo extends BaseMapper<User> {
}
