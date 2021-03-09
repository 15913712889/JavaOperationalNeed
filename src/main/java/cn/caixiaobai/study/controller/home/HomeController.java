package cn.caixiaobai.study.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/08
 * time: 14:22
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/login/toHome")
    public String toHome(){
        return "/home/home";
    }

}
