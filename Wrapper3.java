import java.lang.*;
class ValidateFee
{
	Double fees;
	void validateFees(Double fees)
	{
		Double f=2*Math.pow(10,308);
		if(fees>f)
		{
			System.out.println("Fees is infinite");
		}
		else
			System.out.println("Fees is notinfinite");
	}
}
class Wrapper3
{
	public static void main(String args[])
	{
		 ValidateFee v= new  ValidateFee();
		 v. validateFees(34876.0);
	}
}
