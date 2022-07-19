import java.util.Scanner;
class Rectangle
{
public static void main(String arg[])
{
Scanner Rect = new Scanner(System.in);
System.out.print("Enter the Length of the Rectangle:");
double l = Rect.nextDouble();

System.out.print("Enter the Bredth of the Rectangle:");
double b = Rect.nextDouble();

double Area = l * b;
double Perimeter = 2 * (l+b);

System.out.println("Area of the Rectangle is: " + Area);
System.out.println("Perimeter of the Rectangle is: " + Perimeter);
}
}
