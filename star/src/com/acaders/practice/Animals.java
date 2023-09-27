package com.acaders.practice;
class Animal
{
	void eating()
	{
		System.out.println("Animal is eating");
	}
	void sleeping()
	{
		System.out.println("Animal is sleeping");
	}
}
class Tiger extends Animal
{

	void eating()
	{
		System.out.println("Tiger is eating deer");
	}
	void sleeping()
	{
		System.out.println("Tiger is sleeping in forest");
	}
	void roaring()
	{
		System.out.println("Tiger roars");
	}
}
class Deer extends Animal
{

	void eating()
	{
		System.out.println("Deer is eating Salad");
	}
	void sleeping()
	{
		System.out.println("Deer is sleeping in Den");
	}
	void running()
	{
		System.out.println("Deer is running");
	}
	
	
}
class Monkey extends Animal
{

	void eating()
	{
		System.out.println("Monkey is eating banana");
	}
	void sleeping()
	{
		System.out.println("Monkey is sleeping top of the tree");
	}
	void climbing() {
		System.out.println("Monkey climbing the tree");
	}
}

public class Animals {

	public static void main(String[] args) {
		Animal A;
		Tiger t=new Tiger();
		Deer d=new Deer();
		Monkey m=new Monkey();
		
		A=t;
		t.eating();
		t.sleeping();
		t.roaring();
		
		A=d;
		d.eating();
		d.sleeping();
		d.running();
		
		A=m;
		m.eating();
		m.sleeping();
		m.climbing();
		
		

	}

}
