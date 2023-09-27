package com.acaders.practice;

class car
{
	String brand;
	int milage;
	int speed;
}

public class lunchcar {

	public static void main(String[] args) {
		car c=new car();
		c.brand="polo";
		c.milage=30;
		c.speed=180;
		System.out.println("cars details");
		System.out.println(c.brand);
		System.out.println(c.milage);
		System.out.println(c.speed);
	
	}

}
