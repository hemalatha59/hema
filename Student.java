class Student1
{
	Long s_id;
	Character s_grade;
	Double m_fee;
	Boolean isScholorshipEligible;
	Double fee;
	public Student1(Long s_id,Character s_grade,Double m_fee,Boolean isScholorshipEligible)
	{

		 this.s_id=s_id;
		 this.s_grade=s_grade;
		 this.m_fee=m_fee;
		 this.isScholorshipEligible=isScholorshipEligible;
		
	}
	public void calculateFeesStructure() {
		if(s_id!=0 && s_grade=='A' && isScholorshipEligible==true )
		{
			fee=m_fee-m_fee * 10/100;
			System.out.println("10% of fee is excempted the calclated fee is  "+fee);
		}
		else if(s_id!=0 && s_grade=='B' && isScholorshipEligible==true )
		{
			fee=m_fee-m_fee * 8/100;
			System.out.println("8% of fee is excempted the calclated fee is  "+fee);
		}
		else if(s_id!=0 && s_grade=='C' && isScholorshipEligible==true )
		{
			fee=m_fee-m_fee * 6/100;
			System.out.println("6% of fee is excempted the calclated fee is  "+fee);
		}
		else if(s_id!=0 && s_grade=='D' && isScholorshipEligible==true )
		{
			fee=m_fee-m_fee * 4/100;
			System.out.println("4% of fee is excempted the calclated fee is  "+fee);
		}
		else
			System.out.println("Not eligible for exemption");
	}
	
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1=new Student1(234L,'C',600.0,true);
		Student1 s2=new Student1(115L,'B',909.50,true);
		Student1 s3=new Student1(980L,'G',1810.0,false);
		s1.calculateFeesStructure();
		s2.calculateFeesStructure();
		s3.calculateFeesStructure();
	}

}
