package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestForech {

	public static void main(String[] args) {

		List<Integer> lis = new ArrayList<>();
		lis.add(1);
		lis.add(2);
		lis.add(3);
		lis.add(4);
		lis.add(5);
		lis.add(6);
		Iterator<Integer>it=lis.iterator();
			while(it.hasNext())
				System.out.println(it.next());
		

		/*
		 * int[] ins = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 4,
		 * 3, 2, 1, 0 }; for (int i = 0; i < ins.length; i++)
		 * 
		 * System.out.println(ins[i]);
		 */

	}

}
