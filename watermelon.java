import java.util.*;
class watermelon
{
 public static void main(String args[])
{int n;
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight");
		int w=sc.nextInt();
		if(w%2==0)
		{
			System.out.println("Watermelon will be distributed in all possible order");
			n=w/2;
			System.out.println("I and my sibling will get "+n);

			for(int i=1;i<w;i++)
			{
				System.out.println(i+" "+(w-i));
				
				
			}
		}
		else
		{
			System.out.println("Watermelon cant be distributed");	
		}		
}	
}