import java.util.*;
class CollectionsDay2Pro1
{
	static List<Integer> A1=new ArrayList<Integer>();
	static List<Integer> A2=new ArrayList<Integer>();
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println(Enter the value or size of n);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{	  Integer a =  new Integer(i);
				storeEvenNumbers(a);
			}
		}
		System.out.println(A1);
		System.out.println(printEvenNumbers());
		System.out.println("Enter key value");
		int k1=sc.nextInt();
		
		Integer k2 =  new Integer(k1);
		retrieveEvenNumbers(k2);
		
		

	}
	public static List<Integer> storeEvenNumbers(Integer a)
	{
		A1.add(a);
		return A1;
	}
	public static List<Integer> printEvenNumbers()
	{
		Iterator itr=A1.iterator();
		while(itr.hasNext())
		{
		Integer b3=(Integer)(itr.next());
		int b=b3.intValue();
		 int b1= b*2;
		Integer b2 =  new Integer(b1);
		A2.add(b2);
		}
		return A2;
	}
	public static int retrieveEvenNumbers(Integer key)
	{
			
			Integer[] arr=A1.toArray(new Integer[0]);
		int val=Arrays.binarySearch(arr,key);
		if(val>0)
		{
		System.out.println(key+" is present at "+val);
		return val;
		}
		else
		return 0;
	}
}
	