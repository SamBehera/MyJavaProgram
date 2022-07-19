import java.util.Scanner;
class Vote
{
	public static void main(String[] Arg)
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("What's your name?");
	String name=ob.nextLine();
	System.out.print("How old are you?");
	int age = ob.nextInt();
	
	if(age < 18)
		{
		System.out.println(name + ", you are not eligible for voting!!");
		}
		else
		{	
		System.out.println(name +", you are eligible for voting.");
		}	

	}
}