package cn.caixiaobai.study.dto;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/10
 * time: 10:50
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class Student {

    private String name;
    private Integer age;
    private Integer sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
