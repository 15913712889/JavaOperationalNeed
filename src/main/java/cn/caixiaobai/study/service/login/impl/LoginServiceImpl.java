package cn.caixiaobai.study.service.login.impl;

import cn.caixiaobai.study.dao.UserMapper;
import cn.caixiaobai.study.pojo.User;
import cn.caixiaobai.study.result.ResultVo;
import cn.caixiaobai.study.service.login.LoginService;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/08
 * time: 10:25
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVo login(HttpServletRequest request, HttpServletResponse response,
                          String username, String password) {


        User user = userMapper.selectOne(new QueryWrapper<User>().eq("username", username).eq("password", password));



        if(!ObjectUtil.isEmpty(user)){
            HttpSession session = request.getSession();
            session.setAttribute("username",user.getUserName());
            return ResultVo.make(200,"登录成功！",null);
        }

        return ResultVo.make(300,"用户名或密码错误！",null);
    }
}
