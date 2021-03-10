package cn.caixiaobai.study.controller.verificationCode;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.ShearCaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/10
 * time: 14:54
 * describe(描述):    测试使用糊涂工具生成二维码
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Controller
public class TestVCode {

    @RequestMapping("/test/getVCode")
    public void getVCode(HttpServletRequest request,HttpServletResponse response,@RequestParam(required = false)String randomNum){
        //生成验证码图片-下面两中是样式不同的验证码
        //LineCaptcha Captcha = CaptchaUtil.createLineCaptcha(200, 100);
        ShearCaptcha Captcha = CaptchaUtil.createShearCaptcha(200, 100, 4, 4);
        try {
            request.getSession().setAttribute("CAPTCHA_KEY", Captcha.getCode());
            response.setContentType("image/png");//告诉浏览器输出内容为图片
            response.setHeader("Pragma", "No-cache");//禁止浏览器缓存
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            Captcha.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
