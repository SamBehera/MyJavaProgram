/*25.	WAP to read the month number from the user and print the respective month number is valid or not. */

import java.util.Scanner;
class Mon
{
public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter any num of the month: ");
	int a = ob.nextInt();

	if (a >0 && a<13)
	System.out.print("Entered num has a valid month. ");
	else
	System.out.print("Entered num has no valid month.");
	}
}