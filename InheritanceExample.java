class Vehicle
{
	public void run()
	{
		System.out.println("Every vehicle can run faster");
	}
}

class Bike extends Vehicle
{
	public void tyres()
	{
		System.out.println("Every bike has two tyres");
	}
}
class CDBike extends Bike
{
	public void cdBikeMethod()
	{
		System.out.println("CD bikes are good for gentle man use");
	}
}

class InheritanceExample
{
	public static void main(String args[])
	{
		CDBike cdBike=new CDBike();
		
		cdBike.run();
		
		cdBike.tyres();
		
		cdBike.cdBikeMethod();
	}
}