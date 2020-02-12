/* 27. In a string check whether all the vowels are present
    if yes return 1 else 2.
    ex: String 1="education"
        output=1.
*/

import java.util.*;
class StringsPro27
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		//String v = "aeiou";
		if(s.contains("a") && s.contains("e") && s.contains("i") && s.contains("o") && s.contains("u")){
		System.out.println("All vowels are present");}
		else{
		System.out.println("All vowels are not present");}

	}
}

