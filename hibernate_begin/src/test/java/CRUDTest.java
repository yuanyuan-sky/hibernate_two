import Entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Create By yuanyuan on 2019/9/30 22:21
 */
public class CRUDTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void setUp() throws Exception {
        Configuration config = new Configuration().configure();//创建配置对象
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().
                applySettings(config.getProperties());
        StandardServiceRegistry ssr = ssrb.build();
        sessionFactory = config.buildSessionFactory(ssr);
        session = sessionFactory.openSession();//开启会话
        transaction = session.beginTransaction();//开启事务
    }

    @After
    public void tearDown() throws Exception {
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void getTest() {
        StudentEntity student = (StudentEntity) session.get(StudentEntity.class, 1);
        System.out.println(student);
    }
    /*
    * get与load的区别
    * 1、在不考虑缓存的情况下，get方法会在调用之后l立即向数据库发出sql语句，返回持久化对象
    * 2、load方法会在d调用之后f返回一个代理对象。该代理对象只保存了实体对象的id，
    *       直到使用对象的非主键属性时，才会发出sql语句
    * 3、查询数据库中不存在的数据时，get方法返回null，load方法会抛出异常org.hibernate.ObjectNotFoundException
    * */

    @Test
    public void loadTest() {
        StudentEntity student = (StudentEntity) session.load(StudentEntity.class, 1);
        System.out.println(student.getSid());
        System.out.println("-------------------------");
        System.out.println(student);

    }

    @Test
    public void updateTest() {
        StudentEntity student = (StudentEntity) session.get(StudentEntity.class, 1);
        student.setSname("小王八");
        session.update(student);
    }

    @Test
    public void deleteTest() {
        StudentEntity student = (StudentEntity) session.get(StudentEntity.class, 1);
        session.delete(student);
    }
}
