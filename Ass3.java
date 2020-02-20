package hema;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Ass3 {
	
	private static Map<String, String> $getPhoneNumber(Map<String, String> hm, String[] names) {
		// TODO Auto-generated method stub
		Map<String,String> m1=new LinkedHashMap<String,String>();
		String $num="";
		Iterator<Map.Entry<String,String>> itr=m1.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> e=itr.next();
			for(int i=0;i<names.length;i++)
			{
				String name = null;
				if(names[i].contentEquals(e.getKey())) {
					name=e.getKey();
					$num=e.getValue();
				}
				m1.put(name, $num);
			}
		}
		
		return m1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<String,String> hm=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to enter names and phone numbers");
		int n=sc.nextInt();
		String name;
		String num;
		String pattern="^[0-9] {10}+$";
		for(int i=0;i<n;i++)
		{
				 name=sc.next();
				 num=sc.next();
			if(!num.matches(pattern))
			{
				System.out.println("Num should be 10  digit");
				num=sc.next();
			}
			hm.put(name,num);
		}
		System.out.println(hm);
		System.out.println("enter the num for search");
		int n1=sc.nextInt();
		String names[]=new String[n1];
		for(int i=0;i<n;i++)
		{
			names[i]=sc.nextLine();
		}
		Map<String,String> map=$getPhoneNumber(hm,names);
		for (Entry<String, String> en : map.entrySet()) { 
            System.out.println("name = " + en.getKey() +  
                          ", number = " + en.getValue()); 
        } 	
		
		
	}
	
}

	
