package cn.caixiaobai.study.classLayout;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openjdk.jol.info.ClassLayout;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/27
 * time: 09:25
 * describe(描述): java对象内存布局
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassLayoutDemo01 {

    @Test
    public void demo01(){
        Object o = new Object();
        //将对象转成可以打印的形式
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
