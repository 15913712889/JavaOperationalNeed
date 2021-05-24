package cn.caixiaobai.study.controller.duoXianCheng;

import cn.caixiaobai.study.result.ResultVo;
import cn.caixiaobai.study.service.duoXianCheng.StudyDemo01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.ExecutionException;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/18
 * time: 09:32
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Controller
public class DXCController {

    @Autowired
    private StudyDemo01Service studyDemo01Service;

    @RequestMapping(value = "/duoXianCheng/toPage")
    public String toPage(){
        return "/duoXianCheng/studyDemo01";
    }
    /**
     * duoXianCheng/query
     */
    @RequestMapping(value = "/duoXianCheng/query",method = RequestMethod.POST)
    @ResponseBody
    public ResultVo query(){
        return studyDemo01Service.query();
    }

    /**
     * duoXianCheng/query
     */
    @RequestMapping(value = "/duoXianCheng/query2",method = RequestMethod.POST)
    @ResponseBody
    public ResultVo query2() throws ExecutionException, InterruptedException {
        return studyDemo01Service.query2();
    }
}
