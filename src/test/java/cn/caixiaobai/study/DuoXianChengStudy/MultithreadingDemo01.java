package cn.caixiaobai.study.DuoXianChengStudy;

import cn.caixiaobai.study.DuoXianChengStudy.DuoXianCheng01;
import cn.caixiaobai.study.DuoXianChengStudy.DuoXianCheng02;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.*;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/17
 * time: 14:19
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MultithreadingDemo01 {
    @Test
    public void demo01(){
        for(int a=0; a<10; a++){
            DuoXianCheng01 duoXianCheng01 = new DuoXianCheng01();
            Thread thread = new Thread(duoXianCheng01);
            thread.start();
        }
    }

    @Test
    public void demo02(){
        for(int a=0; a<10; a++){
            DuoXianCheng02 duoXianCheng02 = new DuoXianCheng02();
            Thread thread = new Thread(duoXianCheng02);
            thread.start();
        }
    }

    @Test
    public void demo03() throws ExecutionException, InterruptedException {

        int sum = 0;

        for(int a=0; a<10; a++){
            Callable<Integer> implCallable = new DuoXianCheng03();
            FutureTask<Integer> futureTask = new FutureTask<Integer>(implCallable);
            new Thread(futureTask).start();
            System.out.println(Thread.currentThread().getName()+"----"+futureTask.get());
            sum += futureTask.get();
        }
        System.out.println("总数："+sum);
    }

    @Test
    public void demo04(){
        //使用Executors工具类中的方法创建线程池
        ExecutorService pool  = Executors.newFixedThreadPool(5);//这个参数是指创建几个线程
        DuoXianChengExecutors04 demo = new DuoXianChengExecutors04();
        //为线程池中的线程分配任务,使用submit方法，传入的参数可以是Runnable的实现类，也可以是Callable的实现类
        for(int i=0;i<5;i++){
            System.out.println("第几次创建线程："+i);
            pool.submit(demo);
        }
        //关闭线程池
        //shutdown ： 以一种平和的方式关闭线程池，在关闭线程池之前，会等待线程池中的所有的任务都结束，不在接受新任务
        //shutdownNow ： 立即关闭线程池
        pool.shutdown();
    }
}
