import java.util.*;
class lucky
{
	public static void main(String args[])
	{
	int n;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Bill");
	int bill = input.nextInt();
	System.out.println("Enter date");
	int date = input.nextInt();
	if(date < 0 || date > 31)
			{
				System.out.println("Invalid Date");
			}
		 n = bill % 10;	
	
	if(date == n|| bill%date ==0)
	{	
		System.out.println("Lucky customer");	
	}
	else
	{
	System.out.println("UnLucky customer");	
	}
       }
	
}