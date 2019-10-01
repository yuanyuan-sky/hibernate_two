package test;


import entity.Grade;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.HibernateUtil;

/**
 * Create By yuanyuan on 2019/10/1 20:51
 */
public class ManyToOneTest {
    private Session session;
    private Transaction transaction;

    /**
     * Sets up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        session = HibernateUtil.getSession();
        transaction = session.beginTransaction();
    }

    /**
     * Tear down.
     *
     * @throws Exception the exception
     */
    @After
    public void tearDown() throws Exception {
        transaction.commit();
        HibernateUtil.closeSession(session);
    }

    /**
     * Name.
     */
    @Test
    public void name() {
        Grade grade = new Grade("java开发四班", "第四个拉");
        Student student1 = new Student("小傻", "男");
        Student student2 = new Student("小滕", "男");

        // 设置班级
        student1.setGrade(grade);
        student2.setGrade(grade);
        session.save(grade);
        session.save(student1);
        session.save(student2);
    }
}
