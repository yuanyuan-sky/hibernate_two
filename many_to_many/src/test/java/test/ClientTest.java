package test;

import entity.Employee;
import entity.Project;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.HibernateUtil;

/**
 * Create By yuanyuan on 2019/10/3 19:44
 */
public class ClientTest {

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
        Project project1 = new Project(1001, "项目一");
        Project project2 = new Project(1002, "项目二");
        Employee employee1 = new Employee(1, "小明");
        Employee employee2 = new Employee(2, "小丽");

        //参加项目一的有小明和小丽
        project1.getEmployees().add(employee1);
        project1.getEmployees().add(employee2);

        //参加项目二的有小明
        project2.getEmployees().add(employee1);

        session.save(project1);
        session.save(project2);
    }
}
