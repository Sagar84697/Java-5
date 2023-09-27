package com.acaders.practice;

public class alphaK {

	public static void main(String[] args) {
		int n=10;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=(n/2)+1;j<=n;j++)
			{
			 if(j==n/2+1 || j+i==n+1 || j==i)
			 {
				System.out.print("*"); 
			 }
			 else
			 {
				System.out.print(" ");
			}
			}
			 System.out.println();
		}

	}

}
