package com.acaders.practice;
abstract class Bird
{
	abstract void eat();
	
	abstract void fly();
	
}
abstract class Eagle extends Bird
{
}
abstract class Sparrow extends Bird
{
	
}
class Mountaineagle extends Bird
{
	void eat()
	{
		System.out.println("Mountaineagle eats insects");
	}
	void fly()
	{
		System.out.println("Mountaineagle flies over the mountains");
	}
}
class Oceaneagle extends Bird
{
	void eat()
	{
		System.out.println("Oceaneagle eats fishes");
	}
	void fly()
	{
		System.out.println("Oceaneagle flies over the ocean");
	}
}
class Vegsparrow extends Bird
{
	void eat()
	{
		System.out.println("vegsparrow eats grains");
	}
	void fly()
	{
		System.out.println("vegsparrow flies very low");
	}
}
class NonVegsparrow extends Bird
{
	void eat()
	{
		System.out.println("Nonvegsparrow eats insects");
	}
	void fly()
	{
		System.out.println("Nonvegsparrow flies very high");
	}
}

public class classBirds {

	public static void main(String[] args) {
	   Mountaineagle me= new Mountaineagle();
	   Oceaneagle oe= new Oceaneagle();
	   Vegsparrow vs = new Vegsparrow();
	   NonVegsparrow nvs = new NonVegsparrow();
      
	   
	   Zoo.show(me);
	   Zoo.show(oe);
	   Zoo.show(vs);
	   Zoo.show(nvs);
	}

}

class Zoo
{
	static void show(Bird b)
	{
		b.eat();
		b.fly();
	}
}
