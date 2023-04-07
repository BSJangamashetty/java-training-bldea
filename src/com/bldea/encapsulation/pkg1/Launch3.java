package com.bldea.encapsulation.pkg1;
class Plane
{
	void takeoff()
	{
		System.out.println("Plane tookoff");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land() 
	{
		System.out.println("Plane Landed");
	}
}
class CargoPlane extends Plane
{
	void fly()
	{
		System.out.println("Cargo plane is flying at low height");
	}
	void CarryGoods()
	{
		System.out.println("Cargo plane carry goods");
	}
}
class FighterPlane extends Plane
{
	void fly()
	{
		System.out.println("Fighter plane is flying at great height");
	}
	void CarryWeapons()
	{
		System.out.println("Fighter plane carry weapons");
	}
}
class PassengerPlane extends Plane
{
	void fly()
	{
		System.out.println("Passenger plane is flying at medium height");
	}
	void CarryPassenger()
	{
		System.out.println("Passenger plane carry passenger");
	}
}

public class Launch3 
{
	public static void main(String[] args) 
	{
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		PassengerPlane pp = new PassengerPlane();
		
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.CarryGoods();
		System.out.println("------------");
	
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.CarryWeapons();
		System.out.println("-------------");
		
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.CarryPassenger();
	}
}
