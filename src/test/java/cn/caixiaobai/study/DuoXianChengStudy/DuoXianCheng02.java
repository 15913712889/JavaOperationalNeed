package cn.caixiaobai.study.DuoXianChengStudy;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/17
 * time: 14:42
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class DuoXianCheng02 extends Thread{

    @Override
    public void run() {
        System.out.println("继承Thread的方法实现多线程："+Thread.currentThread().getName());
    }
}
