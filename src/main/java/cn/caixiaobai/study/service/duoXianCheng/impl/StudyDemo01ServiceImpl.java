package cn.caixiaobai.study.service.duoXianCheng.impl;

import cn.caixiaobai.study.mapper.duoXianCheng.LibrarybookMapper;
import cn.caixiaobai.study.pojo.Librarybook;
import cn.caixiaobai.study.result.ResultVo;
import cn.caixiaobai.study.service.duoXianCheng.StudyDemo01Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/18
 * time: 09:50
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Service
@Slf4j
public class StudyDemo01ServiceImpl implements StudyDemo01Service {
    @Autowired
    private LibrarybookMapper librarybookMapper;
    //查询
    @Override
    public ResultVo query(){
        System.out.println("测试正常查询时间-只有主键索引的情况");
        Instant now1 = Instant.now();
        List<Librarybook> librarybooks = librarybookMapper.selectList(null);
        Instant now2 = Instant.now();
        System.out.println("now1："+now1.toString());
        System.out.println("now2："+now2.toString());
        System.out.println("两时间差"+Duration.between(now1, now2).getSeconds()+"秒");
        System.out.println("两时间差"+Duration.between(now1, now2).toMillis()+"纳秒");
        Instant now3 = Instant.now();
        Integer count = librarybookMapper.selectCount(null);
        Instant now4 = Instant.now();
        System.out.println("查询表总数所花时间："+Duration.between(now3, now4).getSeconds()+"秒");
        System.out.println("查询表总数所花时间："+Duration.between(now3, now4).toMillis()+"纳秒");
        System.out.println("表数据总数为："+count);

        return ResultVo.success();
    }

    @Override
    public ResultVo query2() throws ExecutionException, InterruptedException {
        log.info("测试多线程查询");
        //开始时间
        long start = System.currentTimeMillis();
        //返回结果
        List<Librarybook> result = new ArrayList<>();
        //查询数据库总数量
        Integer count = librarybookMapper.selectCount(null);
        //每个线程分摊的数量
        Integer a = count % 4;//因为我的电脑有4个线程数

        if(count % 4!=0){
            a+=1;
        }

        for(int i=0;i<4;i++){
            Callable<List<Librarybook>> implCallable = new QueryImplCallable(a*i+1,(a)*(i+1)+1);

            FutureTask<List<Librarybook>> futureTask = new FutureTask<>(implCallable);
            new Thread(futureTask).start();
            List<Librarybook> librarybooks = futureTask.get();
            result.addAll(librarybooks);
        }
        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("时间差："+(end-start));
        System.out.println("result:");
        System.out.println(result.toString());
        return ResultVo.success();
    }
}
