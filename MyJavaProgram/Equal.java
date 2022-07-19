import java.util.Scanner;
class Equal
{
public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter the first integer");
	int num1 = ob.nextInt();
	System.out.print ("Enter the second integer");
	int num2 = ob.nextInt();

	if (num1 == num2)
	System.out.println("Both the numbers are same.");
	else 
	System.out.println("Both are distinct numbers.");
	}
}

