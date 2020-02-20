//1,2,3,4,5,6
public class Strings1 {
	/*public static void main(String[] args) {
		String stmt = "Java is a Programming Language"; 
		for (String token : stmt.split("\\s"))
			{ 
			System.out.print(token + " ");
			
			}
		}*/




	/*public static void main(String[] args) {
		boolean stmt1 = "hello" == "hello";
		System.out.println(stmt1);//true
		boolean stmt2 = new String("hello") == "hello"; 
		System.out.println(stmt2);//false
		boolean stmt3 = new String("hello") == new String("hello");
		System.out.println(stmt3);//false
		System.out.println(stmt1 && stmt2 || stmt3);//false
		} */




	/*public static void main(String[] args) { 
		StringBuffer buffer1 = new StringBuffer("java");
		StringBuffer buffer2 = new StringBuffer(buffer1);
		if (buffer1.equals(buffer2))
			System.out.println("true");
		else
			System.out.println("false");
	}*/




	/*public static void main(String[] args) { 
		StringBuffer sb1 = new StringBuffer("java"); 
		StringBuffer sb2 = new StringBuffer("java");
		boolean stmt1 =sb1.equals(sb2) ;
	boolean stmt2 = sb1 == sb2; 
	String s1 = new String("java"); 
	String s2 = new String("java");
	boolean stmt3 = s1.equals(s2);
	boolean stmt4 = s1 == s2;
	System.out.println(stmt1);//false
	System.out.println(stmt2);//false
	System.out.println(stmt3);//true
	System.out.println(stmt4);//false
	}*/




/*public static void main(String[] args) { 
	String str = "java";
	StringBuffer sb = new StringBuffer("java"); 
	sb.insert(4, "programming"); 
	str.concat("exercise");
	if (sb.length() < 6 || str.equals("java")) 
	{ 
		System.out.println(sb);//javaprogramming
	}
	sb.delete(2, 7);
	System.out.println(sb);//jagramming
	}*/



	/*public static void main(String[] args) { 
		String s1 = null;
	String s2 = null; 
	if (s1 == s2)
		System.out.print("A"); 
	if (s1.equals(s2))
		System.out.print("B");//NPE
	}*/



	/*public static void main(String[] args) {
		System.out.println("1");
		
			try 
			{
				return;
				//System.out.println("4");
			} 
			catch (Exception e) 
			{
				System.out.println("2");
			} 
			
			finally 
			{
				
				System.out.println("3");
			}
			System.out.println("4");//Not executed bcz try is returning before will execute
			//OP:-1 3
			
		}*/



