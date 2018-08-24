package test;

import java.util.List;

import dao.UserDao;
import model.User;

public class Test {

	@org.junit.Test
	public void test1() {

		UserDao ud = new UserDao();
		List<User> lis = ud.findAll();
		System.out.println(lis);
	}
	@org.junit.Test
	public void test2() {

		UserDao ud = new UserDao();
		System.out.println(ud.findAllCont());
	}
	public static void main(String[] args) {
		UserDao ud = new UserDao();
		System.out.println(ud.findAllCont());
	}

}
