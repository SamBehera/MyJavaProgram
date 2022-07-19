/* 20.	WAP to print the smallest among three integers.  */

import java.util.Scanner;
class Small
{
public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter the first integer");
	int num1 = ob.nextInt();
	System.out.print ("Enter the second integer");
	int num2 = ob.nextInt();
	System.out.print ("Enter the third integer");
	int num3 = ob.nextInt();

	if (num1<num2)
	{	
		if (num3 < num1)
			{
			System.out.print ("smallest: " +num3);
			}
		else 	{
			System.out.print ("smallest: " + num1);
			}
	}
else 
	{
	if(num2<num3)
		{
			System.out.print ("smallest: " + num2);
		}
	else	{
		System.out.print ("smallest: " + num3);
		}
	}
	}
}