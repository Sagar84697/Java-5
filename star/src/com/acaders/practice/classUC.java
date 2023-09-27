package com.acaders.practice;
class Bax
{
	void add(int a,float b)
	{
		System.out.println(a+b);
	}
	void add(double a,double b)
	{
		System.out.println(a+b);
	}
}
public class classUC {

	public static void main(String[] args) {
		float x=20.1f,y=30.0f;
		Bax d=new Bax();
		d.add(x, y);

	}

}
