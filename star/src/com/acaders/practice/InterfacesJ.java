package com.acaders.practice;
import java.util.Scanner;
interface Mycalculator
{
	void addition();
	void subtraction();
}
interface Mycalculator1
{
	void multiply();
	void divide();
}
class Calc1 implements Mycalculator,Mycalculator1
{
	public void addition()
	{
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("addition :"+c);
	}
	public void subtraction()
	{
		int a=20;
		int b=10;
		int c= a-b;
		System.out.println("subtraction :"+c);	
	}
	public void multiply()
	{
		int a=10;
		int b=20;
		int c= a*b;
		System.out.println("multiply :"+c);
	}
	public void divide()
	{
		int a=20;
		int b=10;
		int c= a/b;
		System.out.println("divide :"+c);	
	}
}


public class InterfacesJ {

	public static void main(String[] args) {
		Calc1 c=new Calc1();
		
		

		c.addition();
		c.subtraction();
		c.multiply();
		c.divide();
		
		
	}

}
