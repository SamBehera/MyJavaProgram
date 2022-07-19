/* 22.	 WAP to read 4 subject marks of a student from the user and print their result either of pass of fail. If 35 is the passing mark */

import java.util.Scanner;
class Mark
{
public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter any 3 integers");
	int p = ob.nextInt();
	int c = ob.nextInt();
	int m  = ob.nextInt();
	int b = ob.nextInt();
if ( p<35 || c<35 || m<35 || b<35)

		System.out.print("Fail.");
	else
		System.out.print("Pass.");
	}
}