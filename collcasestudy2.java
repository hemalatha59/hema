package hema;
import java.util.*;
class collcasestudy2
{
	String country;
	static HashSet<String> h1=new HashSet<String>();
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of HashSet");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			String s=sc.next();
	
			storeCountryNames(s);

		}
		System.out.println(h1);
		System.out.println("Enter the country name");
		String s1=sc.next();
		System.out.println(retrieveCountry(s1));

		
	}
	public static HashSet<String> storeCountryNames(String s)
	{
		h1.add(s);
		return h1;
	}
	public static String retrieveCountry(String s1)
	{
		if(h1.contains(s1))
			return s1;
		else 
		return null;
	}
}




