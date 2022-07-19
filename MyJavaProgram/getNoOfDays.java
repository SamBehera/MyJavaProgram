import java.util.Scanner;
public class getNoOfDays 
{
public static void main(String[] args) 
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Month number:");
	int m = sc.nextInt();
	
	switch(m)
	{
	case 1- 3 7 8 10 12:
		System.out.println("31 days.");
		break;
	case 4 5 6 9 11:
		System.out.println("30 days.");
		break;
	case 2:
		System.out.println("28 or 29 days.");
		break;
	default:
		System.out.println("Invalid entry");
		break;
	}
}
}