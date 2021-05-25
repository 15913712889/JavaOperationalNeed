package cn.caixiaobai.study.testJsonToObj;

import cn.caixiaobai.study.pojo.User;
import cn.caixiaobai.study.result.ResultVo;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Stream;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/25
 * time: 11:21
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestJsonToObjDemo01 {
    //使用的是糊涂工具包
    @Test
    public void demo1() {
        List<User> lu = new ArrayList<>();
        for(int a= 0;a<5;a++){
            User user = new User();
            user.setId(a+1);
            user.setUserName("用户名："+a);
            user.setPassword("密码："+a);
            user.setCreateDate(new Date());
            user.setStatus(1);
            lu.add(user);
        }
        ResultVo resultVo = new ResultVo(lu);
        String str = "{'code':200,'message':'操作成功！','obj':" +
                "[" +
                "{'id':1,'userName':'用户名1','password':'密码1','status':1}" +
                "]" +
                "}";

        //方法一：使用工具类转换
        JSONObject jsonObject = JSONUtil.parseObj(str);
        //方法二：new的方式转换
        JSONObject jsonObject2 = new JSONObject(str);
        //json对象转javaBean(参数为javaBean的类对象，注意不是实体对象)
        ResultVo resultVo1 = jsonObject.toBean(ResultVo.class);

        log.info("=====");
    }
}
