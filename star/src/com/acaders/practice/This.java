package com.acaders.practice;
class Tis
{
	Tis()
	{
		this(10);
		System.out.println("zero parametrized constructor");
	}
	Tis(int x)
	{
		this(10,20);
		System.out.println("single parametrized constructor");
		System.out.println("x^2 ="+(x*x));
	}
	Tis(int x, int y)
	{
		System.out.println("two parametrized constructor");
		System.out.println("x times y="+ (x*y));
	}
	
}

public class This {

	public static void main(String[] args) {
		Tis T= new Tis();

	}

}
