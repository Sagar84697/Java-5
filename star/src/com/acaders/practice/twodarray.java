package com.acaders.practice;
import java.util.Scanner;

public class twodarray {

	public static void main(String[] args) {
		Scanner op=new Scanner(System.in);
		int a[][]=new int[3][5];
		   for(int i=0;i<=2;i++)
		   {
			   for(int j=0;j<=4;j++)
			   {
				   System.out.print("enter the number of array: ");
				   a[i][j]=op.nextInt();
			   }
		   }
		   for(int i=0;i<=2;i++)
		   {
			   for(int j=0;j<=4;j++)
			   {
				   System.out.print(a[i][j]+"   ");
				  
			   }
			   System.out.println();
		   }
	}
}


