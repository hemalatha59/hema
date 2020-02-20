package hema;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(2);
		l1.add(1);
		//Collections.sort(l1);//[1, 1, 2, 2, 3, 4]
		//Collections.reverseOrder();//[1, 2, 3, 4, 2, 1]
		l1.remove(1);//[4, 3, 2, 1, 1]
		Collections.sort(l1,Collections.reverseOrder());//[4, 3, 2, 2, 1, 1]
		l1.remove(1);//[4, 2, 1, 1]
		System.out.println(l1);
		*/
		
		
		
		ArrayList l1=new ArrayList<>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		l1.add("e");
		l1.add("b");
		Collections.sort(l1);
		l1.remove("c");//[a, b, b, d, e]
		System.out.println(l1);//[a, b, b, c, d, e]
		
		
		
	}

}
