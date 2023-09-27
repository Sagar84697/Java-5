package com.acaders.practice;
class Parent
{
	int a=10;
	void disp()
	{
		System.out.println("Parent");
	}
}
	class Child extends Parent
	{
		int b=20;
		void display()
		{
			System.out.println("Child");
		}
}
	class Child2 extends Child
	{
		int c=20;
		void show()
		{
			System.out.println("Child2");
		}
	}

public class Inhert {

	public static void main(String[] args)
	{
		Child2 c=new Child2();
	      c.disp();
	      c.display();
          c.show();
          
	}

}
