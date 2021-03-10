package cn.caixiaobai.study.dto;

import java.util.List;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/10
 * time: 11:11
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class ObjsListDto {
    private Integer year;
    private String classNo;
    private List<Student> stuList;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }
}
