package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Create By yuanyuan on 2019/10/1 20:33
 */
public class Grade implements Serializable {

    private int gid;

    private String gname;

    private String gdesc;

    //在一方定义多方的集合
    private Set<Student> students = new HashSet<>();

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Grade() {
    }

    public Grade(String gname, String gdesc) {
        this.gname = gname;
        this.gdesc = gdesc;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gdesc='" + gdesc + '\'' +
                ", students=" + students +
                '}';
    }
}
