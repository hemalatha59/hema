/* 2. In a town the houses are marked with English alphabets. a committee in the town wants to renovate houses in the town. As the funds are limited so they plan to renovate only the houses mark with vowels. The committee head give the list of houses to the members ask them to identify the houses which were not renovated. 
Write an algorithm to help the committee numbers find the list of houses that at where not renovated. 

Input 
The input to the function or method consist of one argument- Houses, string represent in the sequence of house markings . 

Output: 
Return a string representing the list of houses that was not renovated. 
Constraints: 
All  houses markings are of English alphabets. 
*/
package hema;

import java.util.Scanner;

public class HouseRenovate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of house in villages");
		int n=sc.nextInt();
		String[] houses=new String[n];
		System.out.println("Enter entries");
		//int n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			 houses[i] = sc.next();
			System.out.println("House no " +(i+1) +" is "+ houses[i]);
		}
		String[] h1=renovateHouse(houses);
		System.out.println("List of houses which are not renovated");
		for(int i=0;i<h1.length;i++) 
		{
		System.out.println(h1[i]);
		}
	}
	public static String[]  renovateHouse(String[] houses)
	{
		String t="";
		 String houses2[]= new String[houses.length];
		 char ch[]=new char[houses.length];
		for(int i=0;i<houses.length-1;i++)
		{
			if(houses[i].contains("A")||houses[i].contains("E")||houses[i].contains("I")||houses[i].contains("O")||houses[i].contains("U")||houses[i].contains("a")||houses[i].contains("e")||houses[i].contains("i")||houses[i].contains("o")||houses[i].contains("u"))
			{
				
			}
			else
			{
				
					houses2[z++]=houses[i];
						 	
			}
		}
		return houses2;
		
	}


}