package cn.caixiaobai.study.DuoXianChengStudy;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/17
 * time: 14:21
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class DuoXianCheng01 implements Runnable{
    /**
     * 无返回值得情况可以实现Runnable接口，重写run()方法
     */
    @Override
    public void run() {
        System.out.println("当前线程名："+Thread.currentThread().getName());
    }
}
