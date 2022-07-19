import java.util.Scanner;
class Mark1
{
public static void main (String Arg[])
	{
	int avg =0;
	int total = 0;
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter the marks of Phy, Chem, Mat & Bio");
	int p = ob.nextInt();
	int c = ob.nextInt();
	int m  = ob.nextInt();
	int b = ob.nextInt();
	
	if(p<35 || c<35 || m<35 || b<35)
	{
	System.out.println("You failed.");
	}
else
	{
	total = p+c+m+b;
	avg= (total *100 )/ 400;
	System.out.println("Average is" + avg);

	if (avg >85)
	{
	System.out.println("You passed with distinction.");
	}	
	else if (avg>=60 && avg <=85)
	{	
	System.out.println("You passed with first class.");
	}
	else if (avg>=50 && avg <60)
	{	
	System.out.println("You passed with second class.");
	}	
	else	
		{
		System.out.println("You passed with third class.");
		}
	}
	}
}