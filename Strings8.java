/* 8. Find no of characters in a given string which are not repeated.
input: "hello"
output: 3

*/



import java.util.*;
class Strings8
{
	public static void main(String args[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				
			}
			else
			c++;
		}
		System.out.println(c);
	}
}