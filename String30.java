import java.util.*;
class String30
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] st=s.split(" ");
		String[] text=new String[st.length];
		for(int k=0;k<st.length;k++)
		{
			System.out.println(st[k]);
		}
		
		int z=0;
		for(int j=0;j<st[0].length();j++)
		{
			for(int i=0;i<st.length;i++)
			{
				text[z] += st[i].charAt(j);
			}
				z++;
			
				
		
		}
		
		for(int q=0;q<text.length;q++) {
			if(text[q].contains("null") ) 
			{
			System.out.println(text[q].replace("null", ""));
				
			}	
		
	}
		
}
