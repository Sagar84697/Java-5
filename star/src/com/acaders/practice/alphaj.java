package com.acaders.practice;

public class alphaj {

	public static void main(String[] args) {
		int n=10;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			 if(j==n/2+1 || i==1 || i==n && j<n/2+1 || j==1 && i>n/2+2)
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
