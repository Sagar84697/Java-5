package com.acaders.practice;
class Cax
{
	int add(int x,int y)
	{
		return x+y;
	}
	float add(int x, float y)
	{
		return x+y;
	}
	
	float add(float x,int y)
	{
		return x+y;
	}
}

public class classML {

	public static void main(String[] args) {
		Cax c=new Cax();
		System.out.println(c.add(10,20));
		 
		Cax c1=new Cax();
		System.out.println(c.add(10,20.0f));
		
		Cax c2=new Cax();
		System.out.println(c.add(10.0f,20));

	}

}
