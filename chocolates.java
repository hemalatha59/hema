import java.util.*;
class chocolates
{
 	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of children");
		int c=sc.nextInt();
		System.out.println("Enter no of chocolates");
		int ch=sc.nextInt();
		if(c<= 0 && ch<=0)
		System.out.println("Input correct data ");
		for(int i=1;i<=c;i++)
		{
			if(ch>=i)
			{
				ch=ch-i;
			}
			else
			{
				int n=ch-(i-1);
			}
		}
		
		System.out.println("Remaining chocolates "+ch);
		System.out.print("till " +ch);
		
	}
}
			