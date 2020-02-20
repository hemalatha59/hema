import java.util.*;

class offer
{
	public static void main(String args[])
	{
	double tp1,d1,d2;

	Scanner input = new Scanner(System.in);
	System.out.println("Enter Product price1");
	double p1 = input.nextDouble();
	System.out.println("Enter Product price2");
	double  p2 = input.nextDouble();
	System.out.println("Enter Product price3");
	double  p3 = input.nextDouble(); 
	tp1 = p1+ p2 + p3;
	System.out.println("Total prices are"+tp1);
	d1 = tp1 * 0.5;
	if (p1 <= p2 && p1 <= p3) 
	d2= p1;
	else if (p2 <= p1 &&  p2 <= p3) 
        d2= p2;
  	 else
	d2= p3;
	if(d1>d2)
	System.out.println("You will get offeer 1 with discount price of"+d1);
	else
	System.out.println("You will get offeer 2 with discount price of"+d2);
	 
    }
}
	
	