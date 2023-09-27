package com.acaders.practice;
class Demo1
{
	int x,y;
	Demo1()
	{
		x=10;
		y=20;
	}
	Demo1(int x, int y)
	{
	this.x=x;
	this.y=y;
	}
}
  class Demo2 extends Demo1
  {
	  int a,b;
	  Demo2()
	  {
		  a=40;
		  b=60;
	  }
	  Demo2(int a,int b)
	  {
		  this.a=a;
		  this.b=b;
	  }
  }

	
	
public class launchCI {

	public static void main(String[] args) 
	{
		Demo2 d2 = new Demo2(9,99);
		
		
		

	}

}
