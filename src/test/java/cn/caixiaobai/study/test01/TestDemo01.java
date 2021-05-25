package cn.caixiaobai.study.test01;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/10
 * time: 09:25
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo01 {

    @Test
    public void demo01(){
        System.out.println("测试=====");

        StringBuilder s = new StringBuilder("a,b,c");

        int capacity = s.capacity();
        System.out.println("s的当前容量是："+capacity);
    }



    @Test
    public void demo02(){
        byte[] data = "我是一段测试字符串".getBytes();
        Sign sign = SecureUtil.sign(SignAlgorithm.MD5withRSA);
        //签名
        byte[] signed = sign.sign(data);
        //验证签名
        boolean verify = sign.verify(data, signed);
        System.out.println("======："+verify);
    }
}
