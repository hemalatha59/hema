/* 17. input1="abc2012345"
	input2="abc2112660"
	input 3=4
here "abc**" refers to customer id.
12345 refers to last month eb reading and 12660 refers to this month eb 
reading
find the difference between two readings and multiply it by input3

ie., output=(12660-12345)*4
*/

import java.util.*;

class StringsPro17
{
	
	public static void main(String args[])
	{
		int m;
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int n=sc.nextInt();
		String s4=s1.substring(5,s1.length());
		String s5=s2.substring(5,s2.length());
		int a= Integer.parseInt(s4);
		int b= Integer.parseInt(s5);
			m=Math.abs((b-a)*n);
			
			System.out.println(m);
		
	}
}
		