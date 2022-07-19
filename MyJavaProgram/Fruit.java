import java.util.Scanner;
class Fruit
{
String color;
String taste;
Fruit(String color, String taste)
	{
	this.color = color;
	this.taste = taste;
	}
void displayFruit()
{
System.out.println("Color is: " + color);
System.out.println("Taste is: " + taste);
}

public static void main(String arg[])
	{
	Scanner ob1 = new Scanner(System.in);
	System.out.print("Enter Color: ");
	String C = ob1.next();
	System.out.print("Enter Taste: ");
	String T = ob1.next();
	
	Fruit F = new Fruit (C, T);
	F.displayFruit();
	}
}

class Apple extends Fruit
{
	String Origin;
	float Price;
	void displayApple()
	{
	System.out.println("Origin is: "  + Origin);
	System.out.println("Price is: "  + Price);
	System.out.println("Color is: "  + color);
	}
Apple(String Origin, float Price)
{
this.Origin=Origin;
this.Price=Price;
}

	Apple(String Origin, float Price, String color)
	{
	this.Origin=Origin;
	this.Price=Price;
	this.color=color;
	}

public static void main(String Arg[])
{
	Scanner ob = new Scanner(System.in);
	System.out.print("Enter Origin: ");
	String O = ob.next();
	System.out.print("Enter Price: ");
	float P = ob.nextFloat();

	Apple A = new Apple(O, P);
	
	System.out.print("Enter Origin: ");
	O = ob.next();
	System.out.print("Enter Price: ");
	P = ob.nextFloat();
	System.out.print("Enter Color: ");
	String C = ob.next();
	
 	Apple B = new Apple(O, P, C);
	A.displayApple();
	B.displayApple();
 
}
}
