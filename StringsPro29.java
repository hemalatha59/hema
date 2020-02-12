/* 29. input1="the sun raises in the east";
    output1=raises;
    count no vowels in each word and print the word which has max
    no of vowels if two word has max no of vowel print the first one */

import java.util.*;
class StringsPro29
{
	public static void main(String args[])
	{
		int vc=0,max=0,i;
		String temp="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		for(i=0;i<s1.length;i++)
		{
			//System.out.println(s1[i]);
			for(int j=0;j<s1[i].length();j++)
			{
				if(s1[i].charAt(j)=='a'||s1[i].charAt(j)=='e'||s1[i].charAt(j)=='i'||s1[i].charAt(j)=='o'||s1[i].charAt(j)=='u')
				{
					vc++;;
					if(vc>max)
					{
						 temp=s1[i];
						max=vc;
					}
				}
			}
			
				vc=0;
		}
		
		System.out.println(temp+" "+max);	
	}
}