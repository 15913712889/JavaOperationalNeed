package cn.caixiaobai.study.controller.study;

import cn.caixiaobai.study.dto.*;
import cn.caixiaobai.study.result.ResultVo;
import cn.caixiaobai.study.service.study.Demo01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/08
 * time: 15:28
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Controller
@RequestMapping(value = "/test")
public class Demo01Map {

    @Autowired
    private Demo01Service demo01Service;

    @RequestMapping("/selectMap")
    public ResultVo demo01(){
        return demo01Service.query();
    }

    @RequestMapping("/selectMap2")
    public ResultVo demo02(){
        return demo01Service.query2();
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public ResultVo demo3(String userName,String password){
        HashMap<String,Object> hm = new HashMap<>();
        hm.put("userName",userName);
        hm.put("password",password);
        hm.put("creationTime",new Date());
        hm.put("status",0);
       return demo01Service.insert(hm);
    }

    //传递数组集合 用的数组接受，可以免写dto
    @RequestMapping(value = "/insertObj")
    @ResponseBody
    public ResultVo demo4(@RequestBody Person[] p){
        System.out.println("======"+p.toString());
        List<Person> people = Arrays.asList(p);
        return ResultVo.success();
    }

    //传递多个不同对象
    @RequestMapping(value = "/insertObjs")
    @ResponseBody
    public ResultVo demo5(@RequestBody StudentAndTeacherDto dto){
        System.out.println("=======");
        return ResultVo.success();
    }

//    //传递多个不同对象
//    @RequestMapping(value = "/insertObjss")
//    @ResponseBody
//    public ResultVo demo7(@RequestBody List<Student> student, @RequestBody List<Teacher> teacher){
//        System.out.println("=======");
//        return ResultVo.success();
//    }

    //传递单个对象中属性中带集合
    @RequestMapping(value = "/insertObjsList")
    @ResponseBody
    public ResultVo demo6(@RequestBody ObjsListDto objsListDto){
        System.out.println("=======");
        return ResultVo.success();
    }


    //传递map  使用的是post请求
    @RequestMapping(value = "/insertMapObj")
    @ResponseBody
    public ResultVo demo7(@RequestBody Map<String,Object> mapObj){
        System.out.println("=======");
        Integer id = (Integer)mapObj.get("id");
        return ResultVo.success();
    }

    //测试get
    @RequestMapping(value = "/insertMapObjForGet",method = RequestMethod.GET)
    @ResponseBody
    public ResultVo demo8(@RequestParam Map<String,Object> mapObj){
        System.out.println("=======");
        Integer id = (Integer)mapObj.get("id");
        return ResultVo.success();
    }


}
