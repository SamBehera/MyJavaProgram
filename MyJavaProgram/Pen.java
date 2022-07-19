class Pen
{
static String Shape = "Cylindrical";
	String Color;
	String Brand;
	float Price;
static {
System.out.println("Executing static block.");
}
{
System.out.println("Executing non-static block.");
System.out.println("Executing non-static initializer.");
}
public void Display()
{
System.out.println("Brand of the pen" + Brand);
System.out.println("Color of the pen" + Color);
System.out.println("Price of the pen" + Price);
System.out.println("Shape of the pen" + Shape);
}

public static void main(String[] Arg)
{
Pen ob1 = new Pen();
ob1.Color = "Blue";
ob1.Brand = "Cello";
ob1.Price = 25f;
ob1.Display();

Pen ob2 = new Pen();
ob2.Color = "Blue";
ob2.Brand = "Cello";
ob2.Price = 25f;
ob2.Display();
}
}