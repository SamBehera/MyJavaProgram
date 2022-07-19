/*16.	WAP to print the number is negative or positive. */

import java.util.Scanner;
class Number
{
public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print ("Enter the first interger");
	int num = ob.nextInt();

	if (num>=0)
	System.out.println("Number is Positive : " + num);
	else 
	System.out.println("Number is Negative : " + num);
	}
}