import java.util.*;
class StringModifier
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println("Enter Character");
		char c =sc.next().charAt(0);
		System.out.println("Enter position at which u want to insert");
		int pos=sc.nextInt();
		System.out.println(insertCharacter(s,c,pos));
	}
	public static StringBuffer insertCharacter(String s,char c,int pos)
	{
		StringBuffer sb=new StringBuffer(s);
		sb.insert(pos,c);
		return sb;
	}
}