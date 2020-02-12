/* 22. Write a program to rearrange-
Input1=”Hello World”;  output- “dello WorlH”. */

import java.util.*;
class StringsPro22
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String t="";
		t=t+(s.charAt(s.length()-1));
		for(int i=1;i<s.length()-1;i++)
		{
			t=t+s.charAt(i);
		} 
		t=t+(s.charAt(0));

		System.out.println(t);
	}
}