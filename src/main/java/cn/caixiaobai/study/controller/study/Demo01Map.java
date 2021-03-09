package cn.caixiaobai.study.controller.study;

import cn.caixiaobai.study.result.ResultVo;
import cn.caixiaobai.study.service.study.Demo01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/08
 * time: 15:28
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Controller
@RequestMapping(value = "/test")
public class Demo01Map {

    @Autowired
    private Demo01Service demo01Service;

    @RequestMapping("/selectMap")
    public ResultVo demo01(){
        return demo01Service.query();
    }

    @RequestMapping("/selectMap2")
    public ResultVo demo02(){
        return demo01Service.query2();
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public ResultVo demo3(String userName,String password){
        HashMap<String,Object> hm = new HashMap<>();
        hm.put("userName",userName);
        hm.put("password",password);
        hm.put("creationTime",new Date());
        hm.put("status",0);
       return demo01Service.insert(hm);
    }
}
