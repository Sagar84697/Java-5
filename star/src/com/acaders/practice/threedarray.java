package com.acaders.practice;
import java.util.Scanner;

public class threedarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		          int a[][][]= new int[2][3][5];
		          for(int i=0;i<=1;i++)
		          {
		        	  for(int j=0;j<=2;j++)
		        	  {
		        		  for(int k=0;k<=4;k++)
		        		  {
		        			  System.out.print("enter the values:  ");
		        			  a[i][j][k]=sc.nextInt();
		        		  }
		        	  }
		          }
		          for(int i=0;i<=1;i++)
		          {
		        	  for(int j=0;j<=2;j++)
		        	  {
		        		  for(int k=0;k<=4;k++)
		        		  {
		        			  System.out.print(a[i][j][k]+"     ");
		        		  }
		        		  System.out.println();
		        		  System.out.println();
		        	  }
		          }
	}

}
