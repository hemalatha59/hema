/* 25. pan card number validation:
    all letters shud be in caps,shud be of 8 chars.
    first three letters must be alphabets.
    next 4 letters shud be digits and last letter shud be an alphabet
*/
import java.util.*;
class StringsPro25
{
	public static void main(String args[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		String t="";
		if(len==8)
		{ 
		
		for(int i=0;i<3;i++)
		{
			
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
					t=t+s.charAt(i);
					
				
			}}
			for(int j=3;j<7;j++){
			if(s.charAt(j)>='0' && s.charAt(j)<='9')
			{
				
					t=t+s.charAt(j);
					
				
			}}
			if(s.charAt(7)>='A' && s.charAt(7)<='Z'){
				 t=t+s.charAt(7);
					}
			
		 System.out.println("Valid pan num "+t);
		}
		else
		{
		 System.out.println("Enter Valid pan num");
		}
	}
}
			
			
	
			
				 