package entity;

/**
 * Create By yuanyuan on 2019/10/5 14:38
 */
public class Book {
    private int bid;

    private String bname;

    /*一个图书对应一个类别*/
    private Sort sort;

    public Book() {

    }

    public Book(String bname) {
        this.bname = bname;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
