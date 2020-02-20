import java.util.*;
class StringManager
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Strings");
		String s1 = sc.nextLine();
		System.out.println("Enter second String which u want to insert");
		String s2 = sc.nextLine();
		System.out.println("Enter character at which u want to string");
		char c = sc.next().charAt(0);
		System.out.println(insertString(s1,s2,c));
		}
	public static StringBuffer insertString(String s1, String s2,char c)
	{
			StringBuffer sb=new StringBuffer(s1);
			char[] ch=s1.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==c)
				{
					sb.insert(i,s2);
				}
			}
			return sb;
	}
		
}
		