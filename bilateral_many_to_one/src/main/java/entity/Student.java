package entity;

import java.io.Serializable;

/**
 * Create By yuanyuan on 2019/10/1 20:34
 */
public class Student implements Serializable {
    private int sid;
    private String sname;
    private String sex;
    private Grade grade;

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Student() {
    }

    public Student(String sname, String sex) {
        this.sname = sname;
        this.sex = sex;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", grade=" + grade +
                '}';
    }
}
