package com.acaders.practice;
class Max
{
	int a,b;
	Max()
	{
		a=10;
		b=20;
	}
	Max(int x)
	{
		a=x;
		b=x*x;
	}
	Max(int x,int y)
	{
		a=x+y;
		b=x-y;
	}
	String disp()
	{
		return a+"    "+b;
	}
}

public class classCl {

	public static void main(String[] args) {
		Max c=new Max();
		System.out.println(c.disp());
		
		Max c1=new Max(5);
		System.out.println(c1.disp());
		
		Max c2=new Max(10,20);
		System.out.println(c2 .disp());

	}

}
