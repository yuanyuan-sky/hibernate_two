package entity;

import java.io.Serializable;

/**
 * Create By yuanyuan on 2019/10/1 20:34
 */
public class Student implements Serializable {
    private int sid;
    private String sname;
    private String sex;
    //在多方定义一个一方的引用
    private Grade grade;

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public Grade getGrade() {
        return grade;
    }

    /**
     * Sets grade.
     *
     * @param grade the grade
     */
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    /**
     * Instantiates a new Student.
     */
    public Student() {
    }

    /**
     * Instantiates a new Student.
     *
     * @param sname the sname
     * @param sex   the sex
     */
    public Student(String sname, String sex) {
        this.sname = sname;
        this.sex = sex;
    }

    /**
     * Gets sid.
     *
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * Sets sid.
     *
     * @param sid the sid
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * Gets sname.
     *
     * @return the sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * Sets sname.
     *
     * @param sname the sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
