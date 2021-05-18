package cn.caixiaobai.study.DuoXianChengStudy;

import java.util.concurrent.Callable;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/17
 * time: 14:51
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class DuoXianCheng03 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;
        for(int i=0;i<10;i++){
            result += i;
        }
        //System.out.println("当前线程名："+Thread.currentThread().getName()+"result:"+result);
        return result;
    }
}
