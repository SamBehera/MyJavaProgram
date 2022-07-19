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
	
	int diff = num1 - num2;
	
	if (diff < 0)
	diff = diff * (-1);
	System.out.pirntln("Difference is: " + diff);
	}
}