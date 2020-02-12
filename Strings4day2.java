/* 4. Two input strings are accepted. If the two strings are of same length 
concat them and return, if they are not of same length, reduce the longer
 string to size of smaller one, and concat them

input1:"hello"
input2:"hi" 
output:"lohi"
input1:"aaa"
input2:"bbb"
output:"aaabbb" */



import java.util.*;
class Strings4day2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		//char[] ch1=s1.toCharArray();
		//char[] ch2=s2.toCharArray();
		int n=s1.length();
		int m=s2.length();
		if(s1.length()==s2.length())
		{
			System.out.println(s1+s2);
		}
		else
		{
			if(s1.length()>s2.length()){
			
				String s3=s1.substring((m+1),n);
				
					System.out.println(s3+s2);
				
			}
		}
	}
				
					
	
}