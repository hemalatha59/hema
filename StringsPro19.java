/* 19. Find the sum of the numbers in the given input string array
   Input{“2AA”,”12”,”ABC”,”c1a”)
   Output:6 (2+1+2+1)
   Note in the above array 12 must not considered as such
   i.e,it must be considered as 1,2
------------------------------------*/

import java.util.*;

class StringsPro19
{
	
	public static void main(String args[])
	{
		int s=0,a;
		Scanner sc=new Scanner(System.in);
		String[] s1={"2AA","12","ABC","c1a"};
		String t="";
		for(int i=0;i<s1.length;i++)
		{
			t=t+s1[i];
		}
		System.out.println(t);
		
		for(int j=0;j<t.length();j++)
		{
			if(t.charAt(j)>=48 && t.charAt(j)<=57)
			{
				s=s+t.charAt(j);
			}
			
		
		}
		System.out.println(s);
	}
}	