package com.acaders.practice;

class Jas
{
	static int a;
	static int b;
	int x;
	int y;
	
	static
	{
		a=10;
		b=20;
	}
	{
		x=a;
		y=a;
	}
	
	static void disp()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
 
 
	
}

public class lunchjas {

	public static void main(String[] args) {
	Jas s=new Jas();
	s.disp();
	s.display();
	
	
	
	}
		

	}

