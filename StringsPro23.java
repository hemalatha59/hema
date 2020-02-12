/* 23. count the number of words in the string
    Input string="i work in cognizant.";
    output=4;*/

import java.util.*;
class StringsPro23
{
	public static void main(String args[])
	{
		int wc=1;
		//String t="";
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				wc++;
			}
		}
		System.out.println(wc);
	}
}