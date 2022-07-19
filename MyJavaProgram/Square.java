import java.util.Scanner;
class Square
{
public static void main(String arg[])
{
Scanner sq= new Scanner(System.in);
System.out.print("Enter the side of the Square:");
double a = sq.nextDouble();

double Area = a * a;
double Perimeter = 4 * a;

System.out.println("Area of the Square is: " + Area);
System.out.println("Perimeter of the Square is: " + Perimeter);
}
}
