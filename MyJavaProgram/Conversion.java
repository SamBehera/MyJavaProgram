import java.util.Scanner;
class Conversion
{

public static void main(String Arg[])
	{

Scanner Len = new Scanner(System.in);
System.out.println("Enter Length in Centimeter: ");
float cm = Len.nextFloat();

double inch = cm * 0.3937;
System.out.println("\n Length in Inch: " + inch);


double feet = cm * 0.0328;
System.out.println("\n Length in Feet: " + feet);

double meter = cm * 0.01;
System.out.println("\n Length in Meter: " + meter);

	}
}