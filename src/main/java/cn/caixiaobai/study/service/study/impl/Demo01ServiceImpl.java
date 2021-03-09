package cn.caixiaobai.study.service.study.impl;

import cn.caixiaobai.study.dao.UserMapper;
import cn.caixiaobai.study.mapper.study.StudyMapper;
import cn.caixiaobai.study.pojo.User;
import cn.caixiaobai.study.result.ResultVo;
import cn.caixiaobai.study.service.study.Demo01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/08
 * time: 15:31
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Service
public class Demo01ServiceImpl implements Demo01Service {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StudyMapper studyMapper;

    //测试查询返回map
    @Override
    public ResultVo query() {


        List<Map<Integer,String>> l =  studyMapper.query();

        for (Map<Integer,String> m:
                l) {
            //Map<Integer, String> integerStringMap = l.get(0);
            //String id = integerStringMap.get("id");
            String username = m.get("username");
            System.out.println(username);
        }


        List<String> l2 = studyMapper.query2();
        for (String s:
             l2) {
            System.out.println(s);
        }
        return ResultVo.success();
    }

    //使用map进行查询
    @Override
    public ResultVo query2() {

        HashMap<String, Object> soh = new HashMap<>();

        soh.put("id",4);
        soh.put("name","蔡序强");

        List<User> l =  studyMapper.queryStu(soh);
        System.out.println(l.toString());
        return ResultVo.success();
    }
    //通过map一条数据
    @Override
    public ResultVo insert(HashMap<String, Object> hm) {

        Integer i =  studyMapper.insert(hm);
        System.out.println("==="+i);
        return ResultVo.success();
    }
}
