import java.util.Scanner;
class Fruit
{
String color;
void displayFruit()
{
System.out.println("Color is: "  + color);
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
}

Apple(String Origin, float Price)
{
this.Origin=Origin;
this.Price=Price;
}

public static void main(String Arg[])
{
Scanner ob = new Scanner(System.in);
System.out.println("Enter Origin: ");
String O = ob.next();
System.out.println("Enter Price: ");
float P = ob.nextFloat();

Apple A = new Apple(O, P);
A.displayApple();
 
}
}