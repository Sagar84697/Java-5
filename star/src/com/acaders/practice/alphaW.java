package com.acaders.practice;

public class alphaW {

	public static void main(String[] args) {
int n=10;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			 if(j==1 || j+i==n+1 && i>n/2 || i==j && i>n/2 || j==n)
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
