package cn.caixiaobai.study.mapper.study;

import cn.caixiaobai.study.dto.UserDto;
import cn.caixiaobai.study.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/08
 * time: 16:17
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Mapper
public interface StudyMapper {
    @Select("<script>" +
            "select username from user t1" +
            "</script>")
    List<Map<Integer, String>> query();

    @Select("<script>" +
            "select username from user t1" +
            "</script>")
    List<String> query2();

    @Select("<script>" +
            "select * from user t1 " +
            "where t1.userName = #{name} " +
            "and t1.id = #{id} " +
            "</script>")
    List<User> queryStu(HashMap<String, Object> soh);

    @Insert("<script>" +
            "INSERT INTO `user` (userName,password,creationTime,modificationTime,status) VALUES \n" +
            "(#{userName},#{password},#{creationTime},NULL,#{status})\n" +
            "</script>")
    Integer insert(HashMap<String, Object> hm);
}
