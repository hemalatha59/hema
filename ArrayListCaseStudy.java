import java.util.Scanner;
import java.util.*;
import java.util.ArrayList.*;
class Country
{
	String name;
	String capital;
	int population;
	public Country(String name,String capital,int population)
	{
		this.name=name;
		this.capital=capital;
		this.population=population;
	}
}
class ArrayListCaseStudy
{
	public static void main(String args[])
	{
		List<Country> l1=new ArrayList<Country>();
		Country c1=new Country("India","Delhi",1000);
		Country c2=new Country("USA","Washington",2000);
		Country c3=new Country("China","Rushiya",3000);
		//System.out.println(countryNames(ll));
		l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		/*Iterator<Country> itr=l1.iterator();
		if(itr.hasNext())
		{
			System.out.println(itr.next()+" "+itr.next()+" "+itr.next());
		}*/
		for(Country c:l1)
		{
			System.out.println(c.name+" "+c.capital+" "+c.population);
		}
		//System.out.println(l1);
	}
}
	/*public static ArrayList<String> countryNames(ArrayList<String> l1)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of countries");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			l1.add(sc.nextLine());
		}
		return l1;
	}*/
