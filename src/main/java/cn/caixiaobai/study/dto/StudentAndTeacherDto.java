package cn.caixiaobai.study.dto;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/10
 * time: 10:52
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class StudentAndTeacherDto {

    private Student student;
    private Teacher teacher;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
