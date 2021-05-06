package cn.caixiaobai.study.test02Lomada;

import cn.hutool.core.date.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/06
 * time: 10:27
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class demo01 {

    @Test
    public void demo1(){
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8,9});
        Optional<Integer> reduce = stream.reduce((i, j) -> i + j);
        reduce.ifPresent(System.out::println);
    }
}
