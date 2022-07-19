/*wap num is 3 digit or not*/
import java.util.Scanner;
class Numb
{
public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter any 2 integers");
	int a = ob.nextInt();
	
	if(a >= 100 && a <= 999 || a<= -100 && a>= -999)
	{
	System.out.print(" It's a 3 digit num. ");
	}
	else 	
	{
	System.out.print(" It's not a 3 digit num. ");
	}
	}
}	
