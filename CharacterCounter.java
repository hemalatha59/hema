import java.util.*;
class CharacterCounter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println("Enter Character");
		char c =sc.next().charAt(0);
		System.out.println(countCharacter(s,c));
	}
	public static int countCharacter(String s,char c)
	{
		int count=0;
		char ch[] = s.toCharArray();
		for(int i =0;i<ch.length;i++)
		{
			if(ch[i]==c)
			{
				count++;
			}
		}
		return count;
	}
}