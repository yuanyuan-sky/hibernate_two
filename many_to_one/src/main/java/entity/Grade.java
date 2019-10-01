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

    private Set<Student> students = new HashSet<>();

    /**
     * Gets students.
     *
     * @return the students
     */
    public Set<Student> getStudents() {
        return students;
    }

    /**
     * Sets students.
     *
     * @param students the students
     */
    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    /**
     * Instantiates a new Grade.
     */
    public Grade() {
    }

    /**
     * Instantiates a new Grade.
     *
     * @param gname the gname
     * @param gdesc the gdesc
     */
    public Grade(String gname, String gdesc) {
        this.gname = gname;
        this.gdesc = gdesc;
    }

    /**
     * Gets gid.
     *
     * @return the gid
     */
    public int getGid() {
        return gid;
    }

    /**
     * Sets gid.
     *
     * @param gid the gid
     */
    public void setGid(int gid) {
        this.gid = gid;
    }

    /**
     * Gets gname.
     *
     * @return the gname
     */
    public String getGname() {
        return gname;
    }

    /**
     * Sets gname.
     *
     * @param gname the gname
     */
    public void setGname(String gname) {
        this.gname = gname;
    }

    /**
     * Gets gdesc.
     *
     * @return the gdesc
     */
    public String getGdesc() {
        return gdesc;
    }

    /**
     * Sets gdesc.
     *
     * @param gdesc the gdesc
     */
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
