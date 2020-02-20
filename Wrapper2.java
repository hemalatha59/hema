class Stud
{
	Long m;
	Double e;
	public Stud(Double e,Long m)
	{
		this.e=e;
		this.m=m;
		
	}
	public void compareMarks()
	{
		Integer ma=(int) m.longValue();
		Integer eng =(int) e.longValue();
		if(eng>ma)
		{
			System.out.println("English marks is higher than maths");
		}
		else if(ma>eng)
			System.out.println("maths marks is higher than english");
		else
			System.out.println("Equal");
	}
}
public class Wrapper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s1=new Stud(85.0,65L);
		Stud s2=new Stud(56.0,98L);
		Stud s3=new Stud(84.0,84L);
		s1.compareMarks();
		s2.compareMarks();
		s3.compareMarks();
	}

}
