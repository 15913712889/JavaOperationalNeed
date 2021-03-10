package cn.caixiaobai.study.test01;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.map.MapUtil;
import com.sun.media.jfxmedia.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/10
 * time: 14:33
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestListToStrings {

    //通过hutool工具用逗号拼接list集合
    @Test
    public void demo1(){
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        String join = CollUtil.join(l, ",");
        System.out.println(join);  //输出： a,b,c

        //判断列表是否为空
        boolean empty = CollUtil.isEmpty(l);

    }

    @Test
    public void demo2(){
        //将多个键值对加入到Map中
        Map<Object, Object> map = MapUtil.of(new String[][]{
                {"key1", "value1"},
                {"key2", "value2"},
                {"key3", "value3"}
        });
        //判断Map是否为空
        boolean empty = MapUtil.isEmpty(map);
        boolean notEmpty = MapUtil.isNotEmpty(map);

        Console.log("isEmpty:"+empty); //isEmpty:false
        Console.log("isNotEmpty:"+notEmpty);//isNotEmpty:true

    }

    @Test
    public void demo3(){
        //生成验证码图片
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);
        //输出code
        Console.log(lineCaptcha.getCode());
    }
}
