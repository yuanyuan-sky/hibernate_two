package test;


import entity.Book;
import entity.Sort;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.HibernateUtil;

/**
 * Create By yuanyuan on 2019/10/1 20:51
 */
public class OneToOneByPrimaryKey {
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
//        Sort sort = new Sort(1, "科技");
//        Book book = new Book("java核心技术");
//        book.setSort(sort);
//        session.save(book);

        Sort sort1 = (Sort) session.get(Sort.class, 2);
        Book book1 = new Book("C++");
        book1.setSort(sort1);
        session.save(book1);
    }
    @Test
    public void deleteTest() {
//        Sort sort = new Sort(1, "科技");
//        Book book = new Book("java核心技术");
//        book.setSort(sort);
//        session.save(book);
        Sort sort = (Sort) session.get(Sort.class, 1);
        Book book = (Book) session.get(Book.class, 1);
        session.delete(book);

    }


}
