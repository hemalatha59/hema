/* 16. input:
	Searchstring s1="GeniusRajkumarDev";
	String s2="Raj";
	String s3="Dev";
   output:
        Return 1 if s2 comes before s3 in searchstring else return 2

*/
import java.util.*;
class StringsPro16
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		int a= s1.indexOf(s2);
		int b= s1.indexOf(s3);
		if(a<b)
		System.out.println("True");
		else
		System.out.println("True");
	}
}