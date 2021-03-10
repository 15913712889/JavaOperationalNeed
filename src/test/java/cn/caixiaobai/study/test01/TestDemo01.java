package cn.caixiaobai.study.test01;

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

}
