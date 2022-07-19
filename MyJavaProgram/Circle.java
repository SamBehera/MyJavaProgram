import java.util.Scanner;
class Circle
{

public static void main(String Arg[])
	{

Scanner R = new Scanner(System.in);
System.out.print("Enter Radius of the circle: ");
float r = R.nextFloat();

double Area = 3.143 * r * r;
System.out.println("Area of the circle: " + Area);

double C = 2 * 3.143 * r; 
System.out.println("Circumference of the circle: " + C);	
	}
}