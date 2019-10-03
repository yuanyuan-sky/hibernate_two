import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Create By yuanyuan on 2019/9/29 21:33
 */
public class SessionTest {

    @Test
    public void testOpenSession() {
        Configuration config = new Configuration().configure();
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().
                applySettings(config.getProperties());
        StandardServiceRegistry ssr = ssrb.build();
        SessionFactory sessionFactory = config.buildSessionFactory(ssr);
        Session session1 = sessionFactory.openSession();
        Session session2 = sessionFactory.openSession();
        System.out.println(session1 == session2);
        if (session1 != null) {
            System.out.println("session创建成功");
        } else {
            System.out.println("session创建失败");
        }
    }

    @Test
    public void testCurrentSession() {
        Configuration config = new Configuration().configure();
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().
                applySettings(config.getProperties());
        StandardServiceRegistry ssr = ssrb.build();
        SessionFactory sessionFactory = config.buildSessionFactory(ssr);
        /*
        * 使用getCurrentSession获取session，需要在配置文件中指定
        *  <property name="current_session_context_class">thread</property>
        * */
        Session session1 = sessionFactory.getCurrentSession();
        Session session2 = sessionFactory.getCurrentSession();
        System.out.println(session1 == session2);
        if (session1 != null) {
            System.out.println("session创建成功");
        } else {
            System.out.println("session创建失败");
        }
    }

    /*
    * openSession与getCurrentSession的区别
    *
    * 1、getCurrentSession在事务提交或者回滚之后会自动关闭，而openSession需要手动关闭。如果使用openssion而
    *       没有手动关闭，多次之后会导致连接池溢出
    * 2、getCurrentSession每次用的都是同一个session，而openSession每次都创建一个新的session
    * */
}
