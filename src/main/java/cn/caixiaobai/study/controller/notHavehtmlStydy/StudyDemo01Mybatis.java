package cn.caixiaobai.study.controller.notHavehtmlStydy;

import cn.caixiaobai.study.result.ResultVo;
import cn.caixiaobai.study.service.notHaveHtmlStudy.StudyDemo01MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/24
 * time: 16:12
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Controller
public class StudyDemo01Mybatis {

    @Autowired
    private StudyDemo01MybatisService studyDemo01MybatisService;

    /**
     * 测试批量插入
     * @return
     */
        @RequestMapping(value = "/study/mybatis/insertBatch")
    @ResponseBody
    public ResultVo demo01(){

        return studyDemo01MybatisService.demo01();
    }


}
