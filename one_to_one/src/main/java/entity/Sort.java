package entity;

/**
 * Create By yuanyuan on 2019/10/5 14:40
 */
public class Sort {
    private int sid;

    private String sname;

    /*一个类别对应一个图书*/
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Sort() {
    }

    public Sort(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
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
}
