package com.acaders.practice;
class Toy
{
	int x,y;
	Toy()
	{
		x=10;
		y=20;
	}
		
		Toy(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}

class Toy1 extends Toy
{
	int a,b;
	Toy1()
	{
		super(11,111);
		x=9;
		y=99;
		a=999;
		b=9999;
	}
	Toy1(int a, int b)
	{
		this.a=a;
	    this.b=b;
	}
}



public class lunchdemo {

	public static void main(String[] args) {
		Toy1 t=new Toy1();
		System.out.println(t.a);
		
	
	}

}
