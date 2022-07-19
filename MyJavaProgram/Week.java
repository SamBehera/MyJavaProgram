import java.util.Scanner;
class Week
{
   public static void main(String[] Arg)
{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter the day number.");
	int d = ob.nextInt();

switch (d)
{
case 1: 
	System.out.println("Sunday");
	break;
case 2:
	System.out.println("Monday");
	break;
case 3:
	System.out.println("Tuesday");
	break;
case 4: 
	System.out.println("Wednessday");
	break;

case 5: 
	System.out.println("Thurseday");
	break;
case 6:
	System.out.println("Friday");
	break;
case 7:
	System.out.println("Saturday");
	break;

default :
	System.out.println("Invalid entry");
	break;
	}
          }
}
