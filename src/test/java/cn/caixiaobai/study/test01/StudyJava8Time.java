package cn.caixiaobai.study.test01;

import cn.hutool.core.date.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/04/30
 * time: 14:59
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyJava8Time {

    @Test
    public void demo01(){
        //当前时间
        Date date = DateUtil.date();
        System.out.println("当前时间:"+date);
        //当前时间
        Date date2 = DateUtil.date(Calendar.getInstance());
        System.out.println("当前时间:"+date2);
        //当前时间
        Date date3 = DateUtil.date(System.currentTimeMillis());
        System.out.println("当前时间:"+date3);
        //当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();
        System.out.println("当前时间字符串，格式：yyyy-MM-dd HH:mm:ss:"+now);
        //当前日期字符串，格式：yyyy-MM-dd
        String today= DateUtil.today();
        System.out.println("当前日期字符串，格式：yyyy-MM-dd"+now);
        
    }
}
