/*28. swap the every 2 chrecters in the given string 
    If size is odd number then keep the last letter as it is.
    Ex:- input: forget
	 output: ofgrte
    Ex:- input  : NewYork
         output : eNYwrok*/

import java.util.*;
class StringsPro28
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		char[] ch=s.toCharArray();
		int n = ch.length;
		int b= n-1;
		for(int i=0;i< ch.length-1;i=i+2)
			{
			char a  = ch[i];
		  	ch[i]=ch[i+1];
			ch[i+1]=a;	
			
		
			}
		for(int i=0;i<ch.length;i=i+1){
		System.out.print(ch[i]);}
		
		
	
	}
}