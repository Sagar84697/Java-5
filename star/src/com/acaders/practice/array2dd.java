package com.acaders.practice;
import java.util.Scanner;

public class array2dd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][4];
		System.out.println("enter the array values");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=3;j++)
			{
			
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<=1;i++)
		{
		for(int j=0;j<=3;j++)
		{
			System.out.print(a[i][j]+"   ");
		}
		System.out.println();
		}

	}

}
