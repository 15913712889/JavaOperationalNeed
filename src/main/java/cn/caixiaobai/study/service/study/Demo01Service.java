package cn.caixiaobai.study.service.study;

import cn.caixiaobai.study.result.ResultVo;

import java.util.HashMap;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/08
 * time: 15:30
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public interface Demo01Service {

    ResultVo query();

    ResultVo query2();

    ResultVo insert(HashMap<String, Object> hm);
}
