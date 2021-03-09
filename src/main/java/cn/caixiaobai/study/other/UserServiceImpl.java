package cn.caixiaobai.study.other;

import cn.caixiaobai.study.pojo.User;
import cn.caixiaobai.study.dao.UserMapper;
import cn.caixiaobai.study.other.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author 蔡序强
 * @since 2021-03-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
