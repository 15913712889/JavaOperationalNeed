package cn.caixiaobai.study.service.login;

import cn.caixiaobai.study.result.ResultVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/08
 * time: 10:25
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public interface LoginService {

    ResultVo login(HttpServletRequest request, HttpServletResponse response,
                   String username, String password);
}
