package cn.caixiaobai.study.service.notHaveHtmlStudy.impl;

import cn.caixiaobai.study.dao.UserMapper;
import cn.caixiaobai.study.pojo.User;
import cn.caixiaobai.study.result.ResultVo;
import cn.caixiaobai.study.service.notHaveHtmlStudy.StudyDemo01MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/24
 * time: 16:15
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Service
public class StudyDemo01MybatisServiceImpl implements StudyDemo01MybatisService {

    @Autowired
    private cn.caixiaobai.study.dao.UserMapper UserMapper;

    @Autowired
    private UserService UserService;
    /**
     * 测试批量插入
     * @return
     */
    @Override
    public ResultVo demo01() {
//        UserMapper
        List<User> lu = new ArrayList<>();

        for(int a = 0; a<100;a++){
            User user = new User();
            user.setUserName("name"+a);
            user.setPassword("pwd"+a);
            user.setStatus(1);
           // LocalDateTime localDateTime = new LocalDateTime();
            user.setCreateDate(new Date());
            lu.add(user);
        }
        //开始时间
        long start = System.currentTimeMillis();
        UserService.saveBatch(lu);
        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("时间差："+(end-start));
        return null;
    }
}
