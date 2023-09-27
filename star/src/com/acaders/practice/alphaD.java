package com.acaders.practice;

public class alphaD {

	public static void main(String[] args) {
		int n=10;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			 if(j==1 || i==1 && j<=(3*n)/4+1 || i==n && j<=(3*n)/4+1 || j==n && i>1 && i<n)
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
