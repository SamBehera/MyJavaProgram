import java.util.Scanner;
class Special
{
public static void main(String Arg [])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first integer:");
	int num = sc.nextInt();
	int d1 = num/10;
	int d2 = num%10;
	
	int sum = d1+d2+d1*d2;
if(sum == num)
	System.out.print("Special 2 digit number");
	
else
	System.out.print("Not a Special 2 digit number");
	}
}