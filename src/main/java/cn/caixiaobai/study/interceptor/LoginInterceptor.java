package cn.caixiaobai.study.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/05
 * time: 09:58
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Component//加入String容器
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String contextPath = request.getContextPath();
        System.out.println("拦截路径："+contextPath);

        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession();
        Object jon_user_id = session.getAttribute("username");

        //是否登录
        Boolean isLogin = false;

        if(session!=null&&jon_user_id!=null){
                isLogin = true;
        }

        if(isLogin){//如果已经登录过会出现范文的初始页面报错
            return true;
        }else{
            request.getRequestDispatcher("/login").forward(request,response);
        }
        return false;
    }
}
