class Car
{
static int wheels = 4;
	String Brand;
	String Color;
	int Price;

{
System.out.println("\nEvery car is a type of Vehicle.");
}
public void CarDetails()
{
	System.out.println("\n Brand:"+ Brand +"\n Color:"+ Color + "\n Price:" + Price + "\n Wheels:" +wheels +"\n \n");	
}
public static void main(String[] Arg)
{
	Car C1 = new Car();
	C1.Brand = "Ford Mustang";
	C1.Color = "Yellow";
	C1.Price = 4;
	C1.CarDetails();

	Car C2 = new Car();
	C2.Brand = "BMW";
	C2.Color = "White";
	C2.Price = 10;
	C2.CarDetails();
}
}
