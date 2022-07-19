import java.util.Scanner;
class Difference
{
public static void main(String Arg [])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first integer:");
	int num1 = sc.nextInt();
	System.out.print("Enter the second integer:");
	int num2 = sc.nextInt();
	
	if (num1<num2)
	System.out.println("Difference is: " + (num2 - num1));

	if(num1>num2)
	System.out.println("Difference is: " + (num1 - num2));
	}
}