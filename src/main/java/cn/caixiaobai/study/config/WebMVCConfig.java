package cn.caixiaobai.study.config;

import cn.caixiaobai.study.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/05
 * time: 10:25
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
//@Configuration
public class WebMVCConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    /**
     * 添加自定义拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        InterceptorRegistration interceptorRegistration = registry.addInterceptor(loginInterceptor);

        interceptorRegistration.addPathPatterns("/**")//拦截的访问路径，拦截所有
                .excludePathPatterns("/login")//不拦截登录页面
                .excludePathPatterns("/login/user")//不拦截登录请求
               // .excludePathPatterns("/static/*/*")   这个方式在String5.3之后没用
                .excludePathPatterns("/layui-v2.5.6/**")
                .excludePathPatterns("/js/*");
    }


}
