/* 20. Email Validation
   String input1="test@gmail.com"
                1)@ & . should be present;
                2)@ & . should not be repeated;
                3)there should be five charcters between @ and .;
                4)there should be atleast 3 characters before @ ;
                5)the end of mail id should be .com;

*/
import java.util.*;

class StringsPro20
{
	
	public static void main(String args[])
	{
		int c=0,flag=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int a= s.indexOf('@');
		int b= s.indexOf('.');
		String s1=s.substring(b);
		String s2=".com";
		
		if(s1.equals(s2))
		 {
			flag=1;
		}		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='@' && s.charAt(i+6)=='.'  )
				{
				c= 1;
				break;	}
		}
		
			if(c==1  && a>2 && flag == 1)
			System.out.println("Valid Email");
			else
		System.out.println("InValid Email");

	}
}