/*15. compare two strings, if the characters in string 1 are present in
   string 2, then it should be put as such in output, else '+' should be
   put in output...ignore case difference.

	input 1:"New York"
	input 2:"NWYR"

	output:N+w+Y+r+
*/
import java.util.*;
class StringsPro15
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String t=""; 
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					t=t+s2.charAt(j);
					
				}
				if(j%2==0){
				System.out.println(t+"+");}
			}
				
		}
		
	}
}
		