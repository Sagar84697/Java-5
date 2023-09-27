package com.acaders.practice;

public class alphax {

	public static void main(String[] args) {
		int n=10;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			 if(i==j || j+i==n+1)
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
