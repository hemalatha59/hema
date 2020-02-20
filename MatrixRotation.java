package hema;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int[][] ar=new int[m][n];
		int[][] br=new int[m][n];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<ar.length;i++)
		{
			int k=ar.length-1;
			for(int j=0;j<ar[i].length;j++)
			{
				br[i][j]=ar[k][i];
				k--;
			}
		}
		System.out.println("Matrix after 90 degrees rotation");
		for(int i=0;i<br.length;i++)
		{
			for(int j=0;j<br[i].length;j++)
			{
				System.out.print(br[i][j]+" ");
			}
			System.out.println();
		}
	}

}
