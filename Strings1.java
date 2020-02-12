/*1. Write a program which creates a String “Welcome to Java World” and perform 
the following 

i.	Returns the character at 5th position and display it.
ii.	Compare the above String with “Welcome” lexicographically ignoring
 case differences and display the result.
iii. Concatenates “- Let us learn” to the above string and display it.
iv.  Returns the position of the first occurrence of character ‘a’ and
 display it.
v.  Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
vi. Returns string between 4th position and 10th position and display it.
vii. Returns the lowercase of the string and display it


*/
import java.util.*;
class Strings1
{
	public static void main(String args[])
	{
	String s1="Welcome to Java World";
	System.out.println(s1.charAt(5));
	String s2="Welcome";
	int y=s1.compareTo(s2);
	System.out.println(y);
	String s3="Let us learn";
	System.out.println(s1.concat(s3));
	System.out.println(s1.substring(4,11));
	System.out.println(s1.toLowerCase());
	System.out.println(s1.replace('a','e'));
	}
}