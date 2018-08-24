package tools;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sfactory;
	private static ThreadLocal<Session> local=new ThreadLocal<>();
	static{
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		sfactory=cfg.buildSessionFactory();
	}
	public static Session findSession(){
		Session session=local.get();
		if(session==null){
			local.set(sfactory.openSession());
			session=local.get();
		}
		return session;
	}
	//使用getCurrentSession获取的Session对象使用完后不需要手动关闭
	public static Session findGetCurrentSession(){
		return sfactory.getCurrentSession();
	}
	//关闭openSession获取的Session对象
	public static void cloesSession(Session session){
		if(session!=null){
			session.close();
			local.remove();
		}
	}

}
