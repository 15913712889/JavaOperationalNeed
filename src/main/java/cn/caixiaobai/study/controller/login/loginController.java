package cn.caixiaobai.study.controller.login;

import cn.caixiaobai.study.result.ResultVo;
import cn.caixiaobai.study.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/05
 * time: 11:33
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Controller
public class loginController {

    @Autowired
    private LoginService loginService;
    //登录页面跳转
    @RequestMapping(value = "/login")
    public String Login() {
        return "/login/login";
    }

    @RequestMapping(value = "/login/user")
    @ResponseBody
    public ResultVo loginUser(HttpServletRequest request, HttpServletResponse response,
                              String username, String password) {
        System.out.println("controller");
        return loginService.login(request,response,username,password);
    }
}
