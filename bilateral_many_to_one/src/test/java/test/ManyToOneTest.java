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
        Grade grade = new Grade("这是双向多对一", "测试案例");
        Student student1 = new Student("小明", "男");
        Student student2 = new Student("小丽", "女");
//        grade.getStudents().add(student1);
//        grade.getStudents().add(student2);
        student1.setGrade(grade);
        student2.setGrade(grade);
//        session.save(grade);
        session.save(student1);
        session.save(student2);
    }

    @Test
    public void findGradeByStudent() {
        Student student = (Student) session.get(Student.class, 2);
        System.out.println(student.getSid() + "," + student.getSname() + "," + student.getSex());
        Grade grade = student.getGrade();
        System.out.println(grade.getGid() + "," + grade.getGname() + "," + grade.getGdesc());
    }
}
