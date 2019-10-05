package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Create By yuanyuan on 2019/10/1 20:14
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static Session session;

    static {
        Configuration config = new Configuration().configure();
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().
                applySettings(config.getProperties());
        StandardServiceRegistry ssr = ssrb.build();
        sessionFactory = config.buildSessionFactory(ssr);
    }

    /**
     * 获取sessionFactory
     * @return
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session getSession() {
        session = sessionFactory.openSession();
        return session;
    }

    public static void closeSession(Session session) {
        if (session != null) {
            session.close();
        }
    }
}
