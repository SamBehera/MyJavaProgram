class Vehicle
{
int wheels;
String GType;
	
	
	Vehicle(String GType, int wheels)
	{
	this(wheels);
	this.GType = GType;
	this.wheels=wheels;
System.out.println("" + wheels);
	System.out.println("" + GType);
	}

	Vehicle(int wheels)
	{
	this.wheels=wheels;
System.out.println("" + wheels);
	System.out.println("" + GType);
	}
}

class Car1 extends Vehicle
{
String brand;
String model;
double price;
String fueltype;

public void displayCar1()
	{
	System.out.println("" + brand);
	System.out.println(""+ model);
	System.out.println("" + price);
	System.out.println("" + fueltype);
	System.out.println("" + wheels);
	System.out.println("" + GType);
	}
	
	Car1(String GType, String brand, String model, double price, String fueltype, int wheels)
	{
super(GType, wheels);
	this.brand=brand;
	this.model = model;
	this.price = price;
	this.fueltype = fueltype;
	this.wheels = wheels;
	}

public static void main(String arg[])
	{
	Car1 ob = new Car1("Manual", "BMW", "x5", 5000000, "Petrol", 4);
	ob.displayCar1();
	Vehicle ob1 = new Vehicle("Automatic", 4);	
	}
}