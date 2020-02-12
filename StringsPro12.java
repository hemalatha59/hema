/*12. 
String encrption. replace the odd-index character with next character
(if it is 'z' replace with 'a'..if 'a' with 'b' as such), 
leave the even index as such. return the encrypted string.
*/


import java.util.*;
class StringsPro12
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='z')
			{
				t=t+"a";
			}
			else
			t=t+(char)(s.charAt(i)+1);
			

		}
		System.out.println(t);
	}
}