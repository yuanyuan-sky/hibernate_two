package Entity;
import java.sql.Blob;
import java.util.Date;
import java.util.Objects;

/**
 * Create By yuanyuan on 2019/9/21 21:49
 */

public class StudentEntity {
    private int sid;
    private String sname;

    private Date birthday;
    private Blob picture;

    private Address address;

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public StudentEntity() {
    }

    public StudentEntity(int sid, String sname, Date birthday) {
        this.sid = sid;
        this.sname = sname;
        this.birthday = birthday;
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



    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", birthday=" + birthday +
                ", picture=" + picture +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return sid == that.sid &&
                Objects.equals(sname, that.sname) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, address);
    }
}
