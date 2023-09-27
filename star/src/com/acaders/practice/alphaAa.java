package com.acaders.practice;
class Demo
{
	static int x;
	static int y;
	int a;
	int b;
	
	static
	{
		System.out.println("static blocks");
		x=10;
		y=20;
	}
	{
		System.out.println("non static blocks");
		
			a=100;
			b=200;
		}
		
		static void disp()
		{
			System.out.println("static methods");
			System.out.println(x);
			System.out.println(y);
	
		}
		void display()
		{
			System.out.println("non static methods");
			System.out.println(x);
			System.out.println(y);
			System.out.println(a);
			System.out.println(b);
	}
}


public class alphaAa {

	public static void main(String[] args)
	{
	Demo d=new Demo();
	d.disp();
	d.display();
			
	}
	}


