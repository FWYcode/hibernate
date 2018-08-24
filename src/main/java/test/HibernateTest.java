package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import model.User;

public class HibernateTest {
	@Test
	public void testHBM(){
		
		Configuration cf=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session sess=sf.openSession();
		User user=new User();
		user.setName("张三");
		user.setPassword("123");
		Transaction tx=sess.beginTransaction();
		try {
			sess.save(user);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		
	}
}
