/* 26. i/p: Honesty is my best policy
    o/p: Honesty
    Return the maximum word length from the given string.
    If there are two words of same length then,
    return the word which comes first based on alphabetical order. */

import java.util.*;
class StringsPro26
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		int n=s1.length;
		int max=0;
		String a="";
		for(int i=0;i<n;i++)
		{	
			if(s1[i].length() >max)
			{
				max=s1[i].length() ;
				a=s1[i];

			}
		}
		System.out.println(a);
	}
}