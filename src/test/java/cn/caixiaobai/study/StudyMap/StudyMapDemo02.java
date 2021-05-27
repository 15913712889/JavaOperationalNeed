package cn.caixiaobai.study.StudyMap;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openjdk.jol.info.ClassLayout;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/27
 * time: 11:03
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StudyMapDemo02 {
    @Test
    public void demo01(){
        HashMap<String, String> oh = new HashMap<>();
        oh.put("1","name1");
        oh.put("2","name2");
        oh.put("3","name3");

        oh.forEach((key,value)->{
            System.out.println("a:"+key);
            System.out.println("b:"+value);
        });


        Set hs = new HashSet();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        System.out.println("hs"+hs);//hs[a, b, c, d]
        hs.forEach(a->{
            System.out.println(a);
//            a
//            b
//            c
//            d
        });
        log.info("这是一条info信息！");
        log.debug("这是一条debug信息！");
        log.error("这是一条error信息！");
        log.warn("这是一条warn信息！");
    }
}
