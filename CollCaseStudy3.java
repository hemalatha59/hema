package hema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CollCaseStudy3 {
	public static Map<String,String> storeCountryCapital(Map<String,String> h1, String country,String capital)
	{
		h1.put(country, capital);
		return h1;
		
	}
	public static String retrieveCountryName(Map<String,String> h1, String capital)
	{
		String country1 = null;
		Iterator<Map.Entry<String,String>> itr=h1.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> entry=itr.next();
			if(entry.getValue().contentEquals(capital))
			{
				 country1=entry.getKey();
			}
		}
		return country1;
		
	}
	public static String retrieveCapitalName(Map<String,String> h1, String country)
	{
		String capital1 = null;
		Iterator<Map.Entry<String,String>> itr=h1.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> entry=itr.next();
			if(entry.getKey().contentEquals(country))
			{
				 capital1=entry.getValue();
			}
		}
		return capital1;
		
		
	}
	public static Map<String,String>  rev(Map<String,String> h1)
	{
		Map<String,String> h2 = new HashMap<String,String>();

		Iterator<Map.Entry<String,String>> itr=h1.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> entry=itr.next();
			h2.put(entry.getValue(),entry.getKey());
		}
			
		return h2;
		}
	public static List<String> storeKey(Map<String,String> h1)
	{
		List<String> l1= new ArrayList<String>();
		Iterator<Map.Entry<String,String>> itr=h1.entrySet().iterator();
		while(itr.hasNext())
		{	
			Map.Entry<String,String> entry=itr.next();
			l1.add(entry.getKey());
		}
		return l1;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> h1 = new HashMap<String,String>();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of value");
		int n=sc.nextInt();
		//String capital;
		for(int i=0;i<n;i++)
		{
			String country=sc.next();
			String capital=sc.next();
			h1=storeCountryCapital( h1,country, capital);
			
		}
		
		System.out.println(h1);
		
		System.out.println("Enter the capital to retrive country name");
		String s=sc.next();
		String s1=retrieveCountryName(h1,s);
		System.out.println(s1);
		
		System.out.println("Enter the country to retrive capital name");
		String ss=sc.next();
		String s2=retrieveCapitalName(h1,ss);
		System.out.println(s2);
		System.out.println("Swapping of keys and values");
		Map<String,String> h2=rev(h1);
		System.out.println(h2);
		System.out.println("Keys of hashmap stored as arraylist");
		List<String> l2=storeKey(h1);
		System.out.println(l2);
		
	}

}
