package cn.caixiaobai.study.DuoXianChengStudy;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/17
 * time: 15:24
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class DuoXianChengExecutors04 implements Runnable{

    /**多线程的共享数据*/

    private int i = 0;

    //使用Executors创建线程池的方法可以继承Thread类也可以实现Runable接口
    @Override
    public void run() {
        while(i<=30){
            System.out.println(Thread.currentThread().getName()+"---"+ i++);
        }

        if(i>=30){
            System.out.println("线程池名："+Thread.currentThread().getName()+"当前线程i已操作完成！");
        }
    }
}
