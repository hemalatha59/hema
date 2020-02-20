import java.util.*;
class EvenSum
{
	int getSmallest(int[] arr,int n)
	{
	int min,j;
	min=arr[0];
	for(j=0;j<n;j++)
		{
			if(arr[j]<min)
			{f
				min=arr[j];
			}
		}
		return min;
	}
	public static void main(String[] args)
	{
	int n;
	Scanner sc= new Scanner(System.in);
	int[] arr= new int[10];
	System.out.println("Enter size of arrays");
	 n=sc.nextInt();
	System.out.println("Enter array elements");
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	EvenSum e= new EvenSum();
	int a=e.getSmallest(arr,n);
	System.out.println(a);
}
}