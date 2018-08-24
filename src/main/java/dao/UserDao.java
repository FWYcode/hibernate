package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.User;
import tools.HibernateUtil;

public class UserDao {

	@SuppressWarnings("unchecked")
	public List<User> findAll() {

		Session session = HibernateUtil.findSession();
		Transaction tx = null;
		List<User> lis = null;
		try {
			tx = session.beginTransaction();
			lis = session.createQuery("FROM User").list();
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return lis;

	}

	public int findAllCont() {
		Session session = HibernateUtil.findSession();
		Long count = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			count = (Long) session.createQuery("select count(*) from User").uniqueResult();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return count.intValue();

	}

}
