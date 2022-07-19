import java.util.Scanner;
class Leap 
{
	public static void main(String Arg[])
	{
	Scanner ob = new Scanner(System.in);
	int y = ob.nextInt();
	if(y%4==0 && y%100!=0 || y%400==0)
	{
		System.out.print("Leap year");
	}
	else
	{
		System.out.print("Not a Leap year.");
	}
	}
}