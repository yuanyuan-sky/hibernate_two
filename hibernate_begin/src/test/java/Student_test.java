import Entity.Address;
import Entity.StudentEntity;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Date;

/**
 * Create By yuanyuan on 2019/9/21 21:00
 */
public class Student_test {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    @Before
    public void init() {
        Configuration config = new Configuration().configure();//创建配置对象
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().
                applySettings(config.getProperties());
        StandardServiceRegistry ssr = ssrb.build();
        SessionFactory sessionFactory = config.buildSessionFactory(ssr);
        session = sessionFactory.openSession();//开启会话
        /*
        * hibernate对数据的操作都是封装在事务当中，并且默认是非自动提交的。
        * 所以用session保存对象时，如果不开启事务，并且手工提交，对象并不会保存在数据库中
        * */
        transaction = session.beginTransaction();//开启事务

        /*下面这个dowork方法就是将hibernate设置成自动提交的方式，通常不推荐这么做
        * 改成自动提交后，每次执行完session的方法后，都要执行session.flush()方法，否则数据不会保存到数据库中
        * */
//        session.doWork(new Work() {
//            @Override
//            public void execute(Connection connection) throws SQLException {
//                connection.setAutoCommit(true);
//            }
//        });

    }

    @After
    public void destroy() {
        transaction.commit();
        session.close();
    }

    @Test
    public void testInsert() throws IOException {
        StudentEntity entity = new StudentEntity(2, "tom", new Date());
        Entity.Address address = new Address("123", "12345453212", "上海市");
        entity.setAddress(address);
        File file = new File("c:" + File.separator + "Users" + File.separator + "yuanyuan" + File.separator + "Pictures" + File.separator + "pic1.jpg");
        InputStream inputStream = new FileInputStream(file);
        Blob blob = Hibernate.getLobCreator(session).createBlob(inputStream, inputStream.available());
        entity.setPicture(blob);
        session.save(entity);
//        session.flush();
    }

    @Test
    public void testSelect() throws SQLException, IOException {
        StudentEntity student = (StudentEntity) session.get(StudentEntity.class, 1);
        Blob image = student.getPicture();
        InputStream inputStream = image.getBinaryStream();
        File file = new File("d:" + File.separator + "test.jpg");
        OutputStream outputStream = new FileOutputStream(file);
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        outputStream.write(buffer);
        inputStream.close();
        outputStream.close();
    }

}
