package cn.caixiaobai.study.controller.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/10
 * time: 19:52
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */@Controller
public class TestFile {

     @RequestMapping("/test/file")
    public String toPage(){
         return "/file/demo01";
     }
}
