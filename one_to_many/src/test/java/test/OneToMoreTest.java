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
public class OneToMoreTest {
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
    public void insertGradeAndStudent() {
        Grade grade = new Grade("java一班", "java开发的第一个班");
        Student student1 = new Student("小明", "女");
        Student student2 = new Student("小丽", "男");

        grade.getStudents().add(student1);
        grade.getStudents().add(student2);
        session.save(grade);
        session.save(student1);
        session.save(student2);
    }

    @Test
    public void findStudentByGrade() {
        Grade grade = (Grade) session.get(Grade.class, 1);
        System.out.println(grade);
    }

    @Test
    public void update() {
        Grade grade = new Grade("java二班", "这是第二个版");
        Student student = (Student) session.get(Student.class, 1);
        grade.getStudents().add(student);
        session.save(grade);
    }

    @Test
    public void delete() {
        Student student = (Student) session.get(Student.class, 2);
        session.delete(student);
    }
}
