package entity;

/**
 * Create By yuanyuan on 2019/10/3 22:34
 */
public class Card {
    private int cid;

    private String ccode;

    /*user与card的一对一关系*/
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Card() {
    }

    public Card(int cid, String ccode) {
        this.cid = cid;
        this.ccode = ccode;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }
}
