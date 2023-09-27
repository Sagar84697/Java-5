package com.acaders.practice;
import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][8];
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=7;j++)
			{
				System.out.print("enter the array value: ");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=7;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
	}
	}
}
