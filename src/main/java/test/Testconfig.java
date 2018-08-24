package test;


import java.util.Map;
import java.util.Set;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Testconfig {
	
	public static void main(String[] args) {
		
		StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder();
		ssrb.configure("hibernate.cfg.xml");
		Map map=ssrb.getSettings();
		System.out.println(map);
		
	}

}
