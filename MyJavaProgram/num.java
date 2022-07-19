/*27.	 WAR to read an integer value from the user and print that integer is digit or number.  */

import java.util.Scanner;
class Num
{
public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter any 2 integers");
	int a = ob.nextInt();
	
	if(a/10 > 0)
	{
	System.out.print(" num ");
	}
	else 	
	{
	System.out.print(" Digit ");
	}
	}
}
