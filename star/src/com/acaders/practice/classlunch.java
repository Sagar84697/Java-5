package com.acaders.practice;
import java.util.Scanner;
class Vax
{
	float p,t,si;
	static float r=2.0f;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("enter principal amt");
		p=sc.nextFloat();
		System.out.println("enter time duration");
		t=sc.nextFloat();
		
	}
	void calculate()
	{
		si=(p*t*r)/100;
		}
	void display()
	{
		System.out.println("si is = "+si);
	}
}

public class classlunch {

	public static void main(String[] args) {
		Vax v=new Vax();
		v.input();
		v.calculate();
		v.display();
		
		Vax v1=new Vax();
		v1.input();
		v1.calculate();
		v1.display();
		
	}

}
