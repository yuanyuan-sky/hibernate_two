package test;


import entity.Card;
import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.HibernateUtil;

/**
 * Create By yuanyuan on 2019/10/1 20:51
 */
public class OneToOneByForeignKey {
    private Session session;
    private Transaction transaction;

    @Before
    public void setUp() throws Exception {
        session = HibernateUtil.getSession();
        transaction = session.beginTransaction();
    }

    @After
    public void tearDown() throws Exception {
        transaction.commit();
        HibernateUtil.closeSession(session);
    }

    @Test
    public void name() {
        User user = new User(2, "小明");
        Card card = new Card(1, "123456");
        card.setUser(user);
        session.save(card);
    }
}
