/* 19.	WAP to read integer value from the user and print that integer is even or odd. */

import java.util.Scanner;
class Oven
{
public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter the integer");
	int num = ob.nextInt();
	
	if (num%2 == 0)
	System.out.println("Number is even");
	else 
	System.out.println("Number is odd");
	}
}
