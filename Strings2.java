/*2.Write a program which creates a StringBuffer “This is StringBuffer” and
 performs the following. 

1.	Adds the string ”- This is a sample program” to existing string and 
	display it.
2.	Inserts the string “Object” into the existing string at 21st postion
	 and display it.
3.	Reverses the entire string and displays it.
4.	Replaces the word “Buffer” with “Builder” and display it. */




import java.util.*;
class Strings2
{
	public static void main(String args[])
	{
	StringBuffer sb=new StringBuffer("This is StringBuffer");
	sb.append("This is a sample program");
	System.out.println(sb);
	sb.insert(21,"Object");
	System.out.println(sb);
	sb.replace(14,21,"Builder");
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	
	}
}
	