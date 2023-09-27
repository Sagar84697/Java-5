package com.acaders.practice;
abstract class Planes
{
	abstract void takeoff();
	abstract void fly();
	abstract void land();
}

class Passengerplane extends Planes
{
	void takeoff() {
		System.out.println("passengerplane takingoff from longrunway");	
	}
	void fly() {
		System.out.println("passengerplane is flying");	
	}


	void land() {
		System.out.println("passengerplane is landing on runway");
	}
	
}
class Cargoplane extends Planes
{
	void takeoff() {
		System.out.println("cargoplane takingoff from mediumrunway");	
	}
	void fly() {
		System.out.println("cargoplane is flying low");	
	}


	void land() {
		System.out.println("cargoplane is landing on water");
	}
	
}
class Fighterplane extends Planes
{
	void takeoff() {
		System.out.println("fighterplane takingoff from shortrunway");	
	}
	void fly() {
		System.out.println("fighterplane is flying high");	
	}


	void land() {
		System.out.println("fighterplane is landing in basecamp");
	}
	
}
public class classPlane {

	public static void main(String[] args) {
		Passengerplane pp=new Passengerplane();
		Cargoplane cp=new Cargoplane();
		Fighterplane fp=new Fighterplane();
		
		Extra.show(pp);
		Extra.show(cp);
		Extra.show(fp);

	}

}

class Extra
{
	static void show(Planes p)
	{
		p.takeoff();
		p.fly();
		p.land();
		
	}
}
