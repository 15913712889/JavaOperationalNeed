package cn.caixiaobai.study.service.duoXianCheng;

import cn.caixiaobai.study.result.ResultVo;

import java.util.concurrent.ExecutionException;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/05/18
 * time: 09:50
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public interface StudyDemo01Service {
    //查询
    public ResultVo query();

    ResultVo query2() throws ExecutionException, InterruptedException;
}
