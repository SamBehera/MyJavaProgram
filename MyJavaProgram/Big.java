import java.util.Scanner;
class Big
{
public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter any 3 integers");
	int num1 = ob.nextInt();
	int num2 = ob.nextInt();
	int num3 = ob.nextInt();

	if(num1 >  num2 && num1 > num3)
		System.out.println(num1 + "is the biggest number." );
	
	else if (num2 > num3)
		System.out.println(num2 + "is the biggest number." );
	
	else 
		System.out.println(num3 + "is the biggest number." );
	}
}
