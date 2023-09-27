package com.acaders.practice;

public class alphaG {

	public static void main(String[] args) {
int n=10;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			 if(j==1 && i<3*n/4 || i==3*n/4 || i==1 && j!=n || j==n && i>=n/2 || i==n/2 && j>=n/2)
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
