package entity;

/**
 * Create By yuanyuan on 2019/10/3 21:41
 */
public class User {
    private int uid;

    private String uname;

    //User与Card一对一关系
    private Card card;

    public User() {
    }

    public User(int uid, String uname) {
        this.uid = uid;
        this.uname = uname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
