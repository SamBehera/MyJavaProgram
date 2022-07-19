/*Write a java program to check the given variable value is less then 100
and inside another if check the number is greater then 80.
if yes, add the value with 25 and print the value
If no, print the satement no operation performed*/

class Check3
{
	public static void main(String[] Arg)
	{
	int chk = 50;
	if(chk<100)
	{
		if(chk>80)	
		{
		int V= chk+25;
		System.out.println("After adding " + V );
		}	
		System.out.println("No operation perfpormed");
	}
	
	}
}
