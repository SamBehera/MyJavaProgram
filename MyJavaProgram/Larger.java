/*18.	WAP to read two double value from the user and print the biggest amount those two. */

import java.util.Scanner;
class Larger
{
public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter the first integer");
	int num1 = ob.nextInt();
	System.out.print ("Enter the second integer");
	int num2 = ob.nextInt();

	if (num1>num2)
	System.out.println("Largest number is :  "+ num1);
	else 
	System.out.println("Largest number is :  "+ num2);
	}
}
